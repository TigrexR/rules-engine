package com.tigrex.rules.authorize.service.impl;

import com.tigrex.rules.authorize.mapper.UserMapper;
import com.tigrex.rules.authorize.model.bo.UserBO;
import com.tigrex.rules.authorize.model.entity.User;
import com.tigrex.rules.authorize.model.query.UserQuery;
import com.tigrex.rules.authorize.service.UserService;
import com.tigrex.rules.core.utils.JacksonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linus
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public Integer save(UserBO user) {
        User chosen = mapper.selectById(user.getCode());
        if (chosen != null) {
            return mapper.updateById(JacksonUtils.getJackson().convertValue(user, User.class));
        } else {
            return mapper.insert(JacksonUtils.getJackson().convertValue(user, User.class));
        }
    }

    @Override
    public UserBO getUser(UserQuery query) {
        return JacksonUtils.getJackson().convertValue(mapper.selectById(query.getCode()), UserBO.class);
    }
}
