package com.tigrex.rules.provider.client;

import com.tigrex.rules.provider.model.query.ModelQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linus
 */
@FeignClient(name = "provider", contextId = "test")
public interface TestClient {

    @RequestMapping(value = "/hello")
    String hello(@RequestBody() ModelQuery query);
}
