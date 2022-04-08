package com.tigrex.rules.processor.controller;

import com.tigrex.rules.core.utils.JacksonUtils;
import com.tigrex.rules.processor.model.query.GroovyScriptQuery;
import com.tigrex.rules.processor.model.vo.GroovyScriptVO;
import com.tigrex.rules.processor.service.GroovyScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/groovyScript")
public class GroovyScriptController {

    @Autowired
    private GroovyScriptService service;

    @RequestMapping(value = "/getGroovyScript", method = RequestMethod.POST)
    public GroovyScriptVO getGroovyScript(@RequestBody()GroovyScriptQuery query) {
        return JacksonUtils.getJackson().convertValue(service.getGroovyScript(query), GroovyScriptVO.class);
    }
}
