package com.tigrex.rules.authorize.controller;

import com.tigrex.rules.authorize.model.query.UserQuery;
import com.tigrex.rules.authorize.model.vo.UserVO;
import com.tigrex.rules.authorize.service.UserService;
import com.tigrex.rules.core.utils.JacksonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public UserVO getUser(@RequestBody()UserQuery query) {
        return JacksonUtils.getJackson().convertValue(service.getUser(query), UserVO.class);
    }

    @RequestMapping(value = "/login")
    public UserVO login(@RequestBody()UserQuery query) {
        return JacksonUtils.getJackson().convertValue(service.getUser(query), UserVO.class);
    }

    @RequestMapping(value = "/keep")
    public UserVO keep(@RequestBody()UserQuery query) {
        return JacksonUtils.getJackson().convertValue(service.getUser(query), UserVO.class);
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world!";
    }
}
