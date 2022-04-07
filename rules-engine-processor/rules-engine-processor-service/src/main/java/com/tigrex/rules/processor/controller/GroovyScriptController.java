package com.tigrex.rules.processor.controller;

import com.tigrex.rules.processor.model.query.GroovyScriptQuery;
import com.tigrex.rules.processor.model.vo.GroovyScriptVO;
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

    @RequestMapping(value = "/getGroovyScript", method = RequestMethod.POST)
    public GroovyScriptVO getGroovyScript(@RequestBody()GroovyScriptQuery query) {
        return new GroovyScriptVO().setScriptCode(query.getScriptCode());
    }
}
