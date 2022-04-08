package com.tigrex.rules.processor.service;

import com.tigrex.rules.processor.model.bo.GroovyScriptBO;
import com.tigrex.rules.processor.model.query.GroovyScriptQuery;

/**
 * @author linus
 */
public interface GroovyScriptService {

    /**
     * get groovy script
     * @param query query
     * @return script
     */
    GroovyScriptBO getGroovyScript(GroovyScriptQuery query);

    /**
     * save
     * @param groovyScript script
     * @return int
     */
    Integer save(GroovyScriptBO groovyScript);
}
