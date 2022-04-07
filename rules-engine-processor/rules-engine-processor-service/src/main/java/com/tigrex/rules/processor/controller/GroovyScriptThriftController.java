package com.tigrex.rules.processor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/groovyScript")
public class GroovyScriptThriftController {

    @RequestMapping(value = "/thrift/execute")
    public String execute() {
        return "OK";
    }
}
