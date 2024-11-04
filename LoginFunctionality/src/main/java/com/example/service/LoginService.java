package com.example.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.example.request.LoginRequest;

public interface LoginService {

	ResponseEntity<Map<String, Object>> getLogin(LoginRequest request);

}
