package com.example.feign.client.demofeignclient.fallbacks;

import com.example.feign.client.demofeignclient.client.GenderClient;
import com.example.feign.client.demofeignclient.dtos.FallbackResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FallbackFactoryGender implements FallbackFactory<GenderClient> {

    @Override
    public GenderClient create(Throwable cause) {
        log.error("An exception occurred when calling the GenderClient", cause);
        return name -> {
            log.info("Executing fallback factory.....");
            return new ResponseEntity<>(FallbackResponseDto.builder().statusCode(200).message("Fallback Factory Ok").build(),
                    HttpStatus.ACCEPTED);
        };
    }
}
