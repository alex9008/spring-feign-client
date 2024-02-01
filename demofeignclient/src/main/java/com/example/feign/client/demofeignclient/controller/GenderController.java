package com.example.feign.client.demofeignclient.controller;

import com.example.feign.client.demofeignclient.client.GenderClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GenderController {

    private final GenderClient genderClient;

    public GenderController(GenderClient genderClient) {
        this.genderClient = genderClient;
    }

    @GetMapping("/gender")
    public ResponseEntity<Object> getName(@RequestParam("name") String name) {
        System.out.println("genderClient = " + genderClient);
        return genderClient.getName(name);

    }
}
