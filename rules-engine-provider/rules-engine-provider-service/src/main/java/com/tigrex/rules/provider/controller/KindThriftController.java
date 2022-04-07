package com.tigrex.rules.provider.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tigrex.rules.core.utils.JacksonUtils;
import com.tigrex.rules.provider.model.dto.KindDTO;
import com.tigrex.rules.provider.model.query.KindQuery;
import com.tigrex.rules.provider.service.KindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linus
 */
@RestController
@RequestMapping(value = "/kind")
public class KindThriftController {

    @Autowired
    private KindService service;

    @RequestMapping(value = "/thrift/getKind", method = RequestMethod.POST)
    public KindDTO getKind(@RequestBody() KindQuery query) throws JsonProcessingException {
        return JacksonUtils.getJackson().convertValue(service.getKind(query), KindDTO.class);
    }
}
