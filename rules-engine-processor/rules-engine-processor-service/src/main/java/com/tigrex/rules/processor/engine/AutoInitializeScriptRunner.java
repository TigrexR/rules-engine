package com.tigrex.rules.processor.engine;

import com.tigrex.rules.processor.service.GroovyScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author linus
 */
@Component
@Order(1)
public class AutoInitializeScriptRunner implements CommandLineRunner {

    @Autowired
    private GroovyScriptService service;

    @Override
    public void run(String... args) throws Exception {
        //初始化加载数据库中所有的脚本到缓存中
    }
}
