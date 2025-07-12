package com.cognizant.jwt_auth.controller;

import java.util.Base64;
import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt_auth.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> generateToken(@RequestHeader("Authorization") String authHeader) {
        String[] credentials = decodeBasicAuth(authHeader);
        String username = credentials[0];

        // In a real app, you'd validate username/password here
        String token = jwtUtil.generateToken(username);

        return Collections.singletonMap("token", token);
    }

    private String[] decodeBasicAuth(String header) {
        String base64Credentials = header.substring("Basic ".length());
        String credentials = new String(Base64.getDecoder().decode(base64Credentials));
        return credentials.split(":", 2);
    }
}
