package com.configclient.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${common.other}")
    private String other;
    @Value("${common.zhou}")
    private String zhou;

    @GetMapping("/hello")
    public String TestConfigServer() {
        return other+zhou;
    }
}
