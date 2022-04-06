package com.tigrex.rules.authorize.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
public class TestController {

    @RequestMapping(value = "/gateway/oauth2/token/getAccessToken")
    public void getAccessToken() {
        System.out.println("hello world!");
    }
}
