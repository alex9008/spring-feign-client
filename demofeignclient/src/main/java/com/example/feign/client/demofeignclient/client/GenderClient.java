package com.example.feign.client.demofeignclient.client;

import com.example.feign.client.demofeignclient.fallbacks.FallbackFactoryGender;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "genderclient", url = "${gender.client.url}", fallbackFactory = FallbackFactoryGender.class)
public interface GenderClient {

    @GetMapping
    ResponseEntity<Object> getName(@RequestParam("names") String name);
}
