package com.tigrex.rules.core.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Tigrex
 */
public class JacksonUtils {

    private static final ThreadLocal<ObjectMapper> jacksonThreadLocal = ThreadLocal.withInitial(() -> {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    });

    public static ObjectMapper getJackson() {
        return jacksonThreadLocal.get();
    }
}
