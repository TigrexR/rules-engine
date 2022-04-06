package com.tigrex.rules.provider.controller;

import com.tigrex.rules.provider.model.query.ModelQuery;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestBody() ModelQuery query) {
        return "hello " + query.getModelName();
    }
}
