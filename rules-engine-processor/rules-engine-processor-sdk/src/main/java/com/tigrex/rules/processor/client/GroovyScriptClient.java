package com.tigrex.rules.processor.client;

import com.tigrex.rules.processor.model.engine.RulesEngineContext;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linus
 */
@FeignClient(name = "processor", contextId = "groovyScript")
public interface GroovyScriptClient {

    /**
     * execute script
     * @param name name
     * @param context context
     * @return string
     */
    @RequestMapping(value = "/thrift/execute")
    String execute(String name, RulesEngineContext context);
}
