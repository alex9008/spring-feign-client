package com.example.feign.client.demofeignclient.config;

import feign.RequestInterceptor;
import feign.Retryer;
import org.springframework.context.annotation.Bean;

public class ClientConfiguration {

    @Bean
    public RequestInterceptor generateInterceptor(){
        return requestTemplate -> {
            requestTemplate.header("user", "username");
            requestTemplate.header("password", "password");
        };
    }

    @Bean
    public Retryer feignRetryer() {
        // Customize the retry behavior if needed
        return new Retryer.Default();
    }




}
