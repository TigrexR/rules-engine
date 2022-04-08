package com.tigrex.rules.processor.engine;

import com.tigrex.rules.processor.model.engine.RulesEngineContext;

/**
 * @author linus
 */
public interface IRulesEngine<T> {

    /**
     * 获取脚本执行实例
     * @param name name
     * @return T
     */
    T getInstance(String name);

    /**
     * 编译脚本并缓存
     * @param name name
     * @param script script
     */
    void parseAndCache(String name, String script);

    /**
     * 执行
     * @param name name
     * @param context context
     */
    void execute(String name, RulesEngineContext context);
}
