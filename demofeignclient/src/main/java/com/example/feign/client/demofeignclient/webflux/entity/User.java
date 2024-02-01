package com.example.feign.client.demofeignclient.webflux.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@EqualsAndHashCode(of = { "id", "name", "department"})
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(value = "users")
public class User {

    @Id
    private String id;
    private String name;
    private Integer age;
    private double salary;
    private String department;
}
