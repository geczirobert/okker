package com.demo.resource;

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
    public ResponseEntity<Void> webhook(HttpServletRequest request) {
        log(request.getRemoteAddr());
        return ResponseEntity.ok().build();
    }

    private void log(String remoteAddr) {
        LOGGER.info("Visit from '{}'.", remoteAddr);
    }
}
