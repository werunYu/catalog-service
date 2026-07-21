package com.polarbookshop.catalogservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author werun
 * @version 1.0
 * @date 2026/07/14 18:26
 * @description
 **/
@ConfigurationProperties(prefix = "polar")
public class PolarProperties {

    /**
     * A message to welcome users.
     */
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
