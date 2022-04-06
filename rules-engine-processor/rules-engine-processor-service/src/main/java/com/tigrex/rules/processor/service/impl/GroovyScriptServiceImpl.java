package com.tigrex.rules.processor.service.impl;

import com.tigrex.rules.processor.mapper.GroovyScriptMapper;
import com.tigrex.rules.processor.service.GroovyScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linus
 */
@Service(value = "groovyScriptService")
public class GroovyScriptServiceImpl implements GroovyScriptService {

    @Autowired
    private GroovyScriptMapper mapper;
}
