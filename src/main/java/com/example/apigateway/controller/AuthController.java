package com.example.apigateway.controller;
import com.example.apigateway.JwtAuthResponse;
import com.example.apigateway.LoginDto;
import com.example.apigateway.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Correct package


@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private AuthService authService;

    // Build Login REST API
    @PostMapping("/login")
    public ResponseEntity<JwtAuthResponse> login(@RequestBody LoginDto loginDto){
        String token = authService.login(loginDto);

        JwtAuthResponse jwtAuthResponse = new JwtAuthResponse();
        jwtAuthResponse.setAccessToken(token);

        return new ResponseEntity<>(jwtAuthResponse, HttpStatus.OK);
    }
    // Get User Details (GET)
    @GetMapping("/user")
    public ResponseEntity<String> getUser() {
        return new ResponseEntity<>("Authenticated User Details", HttpStatus.OK);
    }


}