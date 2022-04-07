package com.tigrex.rules.provider.client;

import com.tigrex.rules.provider.model.dto.KindDTO;
import com.tigrex.rules.provider.model.query.KindQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author linus
 */
@FeignClient(name = "provider", contextId = "kind")
public interface KindClient {

    /**
     * get kind
     * @param query query
     * @return kind
     */
    @RequestMapping(value = "/kind/thrift/getKind", method = RequestMethod.POST)
    KindDTO getKind(@RequestBody() KindQuery query);
}
