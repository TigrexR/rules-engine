package com.tigrex.rules.processor.engine;

/**
 * @author linus
 */
public interface GroovyScriptExecutor {

    /**
     * run
     * @param context parameters
     * @param result result
     * @return boolean
     */
    Boolean run(Object context, Object result);
}
