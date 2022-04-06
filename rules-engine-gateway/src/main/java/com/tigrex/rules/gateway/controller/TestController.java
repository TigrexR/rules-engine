package com.tigrex.rules.gateway.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/test")
@RefreshScope
public class TestController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world!";
    }
}
