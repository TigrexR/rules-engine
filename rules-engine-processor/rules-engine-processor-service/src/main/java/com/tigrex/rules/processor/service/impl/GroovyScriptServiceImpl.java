package com.tigrex.rules.processor.service.impl;

import com.tigrex.rules.core.utils.JacksonUtils;
import com.tigrex.rules.processor.engine.GroovyScriptExecutor;
import com.tigrex.rules.processor.engine.IRulesEngine;
import com.tigrex.rules.processor.mapper.GroovyScriptMapper;
import com.tigrex.rules.processor.model.bo.GroovyScriptBO;
import com.tigrex.rules.processor.model.entity.GroovyScript;
import com.tigrex.rules.processor.model.query.GroovyScriptQuery;
import com.tigrex.rules.processor.service.GroovyScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linus
 */
@Service(value = "groovyScriptService")
public class GroovyScriptServiceImpl implements GroovyScriptService {

    @Autowired
    private GroovyScriptMapper mapper;
    @Autowired
    private IRulesEngine<GroovyScriptExecutor> helper;

    @Override
    public GroovyScriptBO getGroovyScript(GroovyScriptQuery query) {
        return JacksonUtils.getJackson().convertValue(mapper.selectById(query.getScriptCode()), GroovyScriptBO.class);
    }

    @Override
    public Integer save(GroovyScriptBO groovyScript) {
        GroovyScript chosen = mapper.selectById(groovyScript.getScriptCode());
        int i;
        if (chosen != null) {
            i = mapper.updateById(JacksonUtils.getJackson().convertValue(groovyScript, GroovyScript.class));
        } else {
            i = mapper.insert(JacksonUtils.getJackson().convertValue(groovyScript, GroovyScript.class));
        }
        if (i > 0) {
            helper.parseAndCache(groovyScript.getScriptCode(), groovyScript.getScript());
        }
        return i;
    }
}
