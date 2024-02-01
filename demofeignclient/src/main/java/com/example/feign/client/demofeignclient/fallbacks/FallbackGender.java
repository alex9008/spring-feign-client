package com.example.feign.client.demofeignclient.fallbacks;

import com.example.feign.client.demofeignclient.client.GenderClient;
import com.example.feign.client.demofeignclient.dtos.FallbackResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FallbackGender implements GenderClient {

    @Override
    public ResponseEntity<Object> getName(String name) {
        log.info("Executing fallback.....");
        return new ResponseEntity<>(FallbackResponseDto.builder()
                .statusCode(200)
                .message("Fallback Ok")
                .build(),
                HttpStatus.ACCEPTED);
    }
}
