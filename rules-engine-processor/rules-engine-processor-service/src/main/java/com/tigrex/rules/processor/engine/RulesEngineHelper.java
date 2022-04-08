package com.tigrex.rules.processor.engine;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.tigrex.rules.processor.model.engine.RulesEngineContext;
import groovy.lang.GroovyClassLoader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author linus
 */
@Slf4j
@Component(value = "rulesEngineHelper")
public class RulesEngineHelper implements IRulesEngine<GroovyScriptExecutor> {

    private Map<String, Class<GroovyScriptExecutor>> nameAndClass = Maps.newConcurrentMap();
    private Map<String, Integer> nameAndHash = Maps.newConcurrentMap();

    @Override
    public GroovyScriptExecutor getInstance(String name) {
        try {
            Class<GroovyScriptExecutor> klass = nameAndClass.get(name);
            if (klass == null) {
                throw new IllegalArgumentException(String.format("script:%s not load", name));
            }
            return klass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void parseAndCache(String name, String script) {
        try {
            Preconditions.checkNotNull(name);
            Preconditions.checkNotNull(script);
            String template = GroovyScriptUtils.getScriptTemplate("ScriptTemplate.groovy_template");
            String scriptClassName = RulesEngineHelper.class.getSimpleName() + "_" + name;
            String fullScript = String.format(template, scriptClassName, script);
            //这里需要通过fullScript取匹配nameAndHash中是否存在相同的脚本，如果存在就不存入类缓存中
            if (fullScript.hashCode() != nameAndHash.get(name)) {
                nameAndHash.put(name, fullScript.hashCode());
                //存储类对象到缓存中
                GroovyClassLoader classLoader = new GroovyClassLoader();
                Class scriptClass = classLoader.parseClass(fullScript);
                log.info("collection-engine load script:{} finish", name);
                nameAndClass.put(name, scriptClass);
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void execute(String name, RulesEngineContext context) {
        getInstance(name).run(context.getData(), context.getResult());
    }
}
