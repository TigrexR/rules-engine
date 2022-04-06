package com.tigrex.rules.consumer.controller;

import com.tigrex.rules.authorize.client.UserClient;
import com.tigrex.rules.authorize.model.dto.UserDTO;
import com.tigrex.rules.authorize.model.query.UserQuery;
import com.tigrex.rules.provider.client.TestClient;
import com.tigrex.rules.provider.model.query.ModelQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/test")
@RefreshScope
public class TestController {

    @Value("${isUse}")
    private boolean isUse;

    @Autowired
    private TestClient testClient;
    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/hello")
    public String hello(@RequestBody() ModelQuery query) {
        return testClient.hello(query);
    }

    @RequestMapping(value = "/getConfig")
    public boolean getConfig() {
        return isUse;
    }

    @RequestMapping(value = "getUser")
    public UserDTO getUser(@RequestBody()UserQuery query) {
        return userClient.getUser(query);
    }
}
