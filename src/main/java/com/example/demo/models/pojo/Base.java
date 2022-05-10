package com.example.demo.models.pojo;

import java.time.Instant;

import lombok.Data;

@Data
public class Base {
    
    private Long Id;
    private Instant createdAt;
    private Instant updatedAt;
    
}
