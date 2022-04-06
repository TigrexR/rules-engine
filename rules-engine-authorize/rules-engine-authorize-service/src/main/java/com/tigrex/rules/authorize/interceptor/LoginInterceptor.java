package com.tigrex.rules.authorize.interceptor;

import com.tigrex.rules.authorize.model.bo.UserBO;
import com.tigrex.rules.authorize.model.query.UserQuery;
import com.tigrex.rules.authorize.service.UserService;
import com.tigrex.rules.core.utils.JacksonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author linus
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserBO james = userService.getUser(new UserQuery().setCode("james"));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }
}
