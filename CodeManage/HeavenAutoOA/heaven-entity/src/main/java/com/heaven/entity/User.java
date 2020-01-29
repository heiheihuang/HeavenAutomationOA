package com.heaven.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String name;
    private String pass;
}
