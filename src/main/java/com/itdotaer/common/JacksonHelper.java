package com.itdotaer.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * JacksonHelper
 *
 * @author itdotaer
 * @date 2021/9/29
 */
public class JacksonHelper {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> String toJson(T object) throws JsonProcessingException {
        return mapper.writeValueAsString(object);
    }

    public static <T> T toObject(String json, Class<T> tClass) throws IOException {
        return mapper.readValue(json, tClass);
    }
}
