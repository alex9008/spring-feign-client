package com.example.feign.client.demofeignclient.controller;

import com.example.feign.client.demofeignclient.client.NationalizeClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NationalizeController {

    private final NationalizeClient nationalizeClient;


    public NationalizeController(NationalizeClient nationalizeClient) {
        this.nationalizeClient = nationalizeClient;
    }

    @GetMapping("/nationalize")
    public ResponseEntity<Object> getNationalize(@RequestParam("name") String name) {
        return nationalizeClient.getNationalize(name);

    }
}
