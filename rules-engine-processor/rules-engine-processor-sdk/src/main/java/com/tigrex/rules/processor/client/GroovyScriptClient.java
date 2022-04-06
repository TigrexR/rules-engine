package com.tigrex.rules.processor.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linus
 */
@FeignClient(name = "processor", contextId = "groovyScript")
public interface GroovyScriptClient {

    /**
     * execute script
     * @return string
     */
    @RequestMapping(value = "/groovyScript/execute")
    String execute();
}
