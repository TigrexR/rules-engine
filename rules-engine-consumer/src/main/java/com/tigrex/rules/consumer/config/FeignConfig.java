package com.tigrex.rules.consumer.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author linus
 */
@Configuration
@EnableFeignClients(basePackages = {"com.tigrex.rules.provider", "com.tigrex.rules.authorize"})
public class FeignConfig {
}
