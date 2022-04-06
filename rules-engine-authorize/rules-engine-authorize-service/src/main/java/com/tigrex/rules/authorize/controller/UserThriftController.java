package com.tigrex.rules.authorize.controller;

import com.tigrex.rules.authorize.model.dto.UserDTO;
import com.tigrex.rules.authorize.model.query.UserQuery;
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
public class UserThriftController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/thrift/getUser", method = RequestMethod.POST)
    public UserDTO getUser(@RequestBody() UserQuery query) {
        return JacksonUtils.getJackson().convertValue(service.getUser(query), UserDTO.class);
    }
}
