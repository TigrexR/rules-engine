package com.tigrex.rules.authorize.client;

import com.tigrex.rules.authorize.model.dto.UserDTO;
import com.tigrex.rules.authorize.model.query.UserQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author linus
 */
@FeignClient(name = "authorize", contextId = "user")
public interface UserClient {

    /**
     * get user
     * @param query query
     * @return UserDTO
     */
    @RequestMapping(value = "/user/thrift/getUser", method = RequestMethod.POST)
    UserDTO getUser(@RequestBody() UserQuery query);
}
