package com.tigrex.rules.processor.controller;

import com.tigrex.rules.core.utils.JacksonUtils;
import com.tigrex.rules.processor.engine.GroovyScriptExecutor;
import com.tigrex.rules.processor.engine.IRulesEngine;
import com.tigrex.rules.processor.model.engine.RulesEngineContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/groovyScript")
@Slf4j
public class GroovyScriptThriftController {

    @Autowired
    private IRulesEngine<GroovyScriptExecutor> helper;

    @RequestMapping(value = "/thrift/execute")
    public String execute(String name, RulesEngineContext context) {
        try {
            helper.execute(name, context);
            return JacksonUtils.getJackson().writeValueAsString(context.getResult());
        } catch (Exception e) {
            log.error("groovy error:", e);
        }
        return "execute fail";
    }
}
