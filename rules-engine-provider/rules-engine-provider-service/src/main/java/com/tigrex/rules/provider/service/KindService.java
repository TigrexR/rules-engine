package com.tigrex.rules.provider.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tigrex.rules.provider.model.bo.KindBO;
import com.tigrex.rules.provider.model.query.KindQuery;

/**
 * @author linus
 */
public interface KindService {

    /**
     * get kind data
     * @param query query
     * @return kind
     */
    KindBO getKind(KindQuery query) throws JsonProcessingException;
}
