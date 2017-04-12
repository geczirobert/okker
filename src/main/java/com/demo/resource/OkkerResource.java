package com.demo.resource;

import java.io.BufferedReader;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OkkerResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(OkkerResource.class);

    @RequestMapping(value = "/webhook", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<ChatResponse> webhook(HttpServletRequest request) {
        String line = null;
        StringBuffer body = new StringBuffer();
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null)
                body.append(line);
        } catch (Exception e) {
            /*report an error*/ }
        log(request.getRemoteAddr(), body.toString());
        return ResponseEntity.ok(new ChatResponse());
    }

    private void log(String remoteAddr, String request) {
        LOGGER.info("Visit from '{}', request: '{}'.", remoteAddr, request);
    }
}
