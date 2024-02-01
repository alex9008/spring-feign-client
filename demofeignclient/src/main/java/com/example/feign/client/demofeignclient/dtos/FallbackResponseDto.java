package com.example.feign.client.demofeignclient.dtos;


import lombok.*;

@Getter
@Setter
@Builder
public class FallbackResponseDto {

    private String message;
    private Integer statusCode;
}
