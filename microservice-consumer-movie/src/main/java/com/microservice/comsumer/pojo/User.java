package com.microservice.comsumer.pojo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class User {
    private long id;
    private String username;
    private String name;
    private int age;
    private BigDecimal balance;
}
