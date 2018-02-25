package com.example.demoApp.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RefreshScope
public class DemoController {

    @Value("${secretMessage}")
    private String secretMessage = "cipher message";

    @GetMapping(value = "/secret")
    String secretMessage() {
        log.info("Came inside secretMessage");
        return this.secretMessage;
    }
}
