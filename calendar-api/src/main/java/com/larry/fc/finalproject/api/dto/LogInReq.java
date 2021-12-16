package com.larry.fc.finalproject.api.dto;

import lombok.Data;

@Data
public class LogInReq {
    private final String email;
    private final String password;
}
