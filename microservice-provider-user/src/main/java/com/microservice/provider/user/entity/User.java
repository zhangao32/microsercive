package com.microservice.provider.user.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private int age;
    private BigDecimal balance;

}
