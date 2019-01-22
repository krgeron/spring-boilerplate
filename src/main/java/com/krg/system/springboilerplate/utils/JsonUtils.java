package com.krg.system.springboilerplate.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This is a wrapper-utility class
 * to handle JSON Objects
 */
public final class JsonUtils {

    /**
     * This method would accept a generic {Object}
     * and then write its value as a {String}
     * @param {Object}
     * @return {String}
     */
    public static String convertObjectToString(Object o) {
        String jsonString = "{}";
        if(o != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                jsonString = objectMapper.writeValueAsString(o);
            } catch (JsonProcessingException e) {
                jsonString = "{}";
            }
        }

        return jsonString;
    }

}
