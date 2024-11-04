package com.example.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.LoginRequest;
import com.example.responseBody.ResponseHandler;
import com.example.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService service;
	
	
	public ResponseEntity<Map<String, Object>> login(LoginRequest request){
		return service.getLogin(request);
	}
}
