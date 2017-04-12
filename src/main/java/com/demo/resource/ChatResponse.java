package com.demo.resource;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Class representing chat processing result.
 * @author Robert_Geczi
 */
@JsonSerialize
public class ChatResponse {
    private static final String EMPTY_STRING = "";

    private final String body = EMPTY_STRING;
    private final String displayText = EMPTY_STRING;
    private final List<?> contextOut = Collections.emptyList();
    private final Map<String, String> data = Collections.emptyMap();
    private final String source = EMPTY_STRING;

    public String getBody() {
        return body;
    }

    public String getDisplayText() {
        return displayText;
    }

    public List<?> getContextOut() {
        return contextOut;
    }

    public Map<String, String> getData() {
        return data;
    }

    public String getSource() {
        return source;
    }

}
