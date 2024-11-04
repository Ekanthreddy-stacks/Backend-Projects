package com.example.responseBody;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;

public class ResponseHandler {

	public static ResponseEntity<Map<String,Object>> response(String data,Boolean response, String message){
		Map<String ,Object> hashmap = new HashMap<>();
		hashmap.put("Data", data);
		hashmap.put("Message", message);
		hashmap.put("response", response);
		return ResponseEntity.ok(hashmap);
		
	}
}
