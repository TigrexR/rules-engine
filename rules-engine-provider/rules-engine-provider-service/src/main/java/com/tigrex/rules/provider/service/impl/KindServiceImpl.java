package com.tigrex.rules.provider.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tigrex.rules.core.utils.JacksonUtils;
import com.tigrex.rules.provider.mapper.KindMapper;
import com.tigrex.rules.provider.model.bo.KindBO;
import com.tigrex.rules.provider.model.query.KindQuery;
import com.tigrex.rules.provider.service.KindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author linus
 */
@Slf4j
@Service(value = "kindService")
public class KindServiceImpl implements KindService {

    @Autowired
    private KindMapper mapper;

    @Override
    public KindBO getKind(KindQuery query) throws JsonProcessingException {
        log.info(JacksonUtils.getJackson().writeValueAsString(query));
        return JacksonUtils.getJackson().convertValue(mapper.selectById(query.getKindCode()), KindBO.class);
    }
}
