package com.tigrex.rules.processor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world!";
    }
}
