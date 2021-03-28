package com.digitalinnovationone.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("server.port")
public class ServerConfiguration {

    private String port;

    @Profile("dev")
    @Bean
    public String testPortServerDev() {
        return port;
    }

    @Profile("prod")
    @Bean
    public String testPortServerProd() {
        return port;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
