package com.tigrex.rules.authorize.service;

import com.tigrex.rules.authorize.model.bo.UserBO;
import com.tigrex.rules.authorize.model.query.UserQuery;

/**
 * @author linus
 */
public interface UserService {

    /**
     * save
     * @param user user
     * @return int
     */
    Integer save(UserBO user);

    /**
     * get user
     * @param query query
     * @return UserBO
     */
    UserBO getUser(UserQuery query);
}
