package com.tigrex.rules.processor.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author linus
 */
@FeignClient(name = "processor", contextId = "test")
public interface TestClient {
}
