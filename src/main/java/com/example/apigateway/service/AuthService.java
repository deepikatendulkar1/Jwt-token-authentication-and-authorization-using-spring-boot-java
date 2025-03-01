package com.example.apigateway.service;

import com.example.apigateway.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
