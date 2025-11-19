package com.favian;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(SessionMissingData.class)
	public ResponseEntity<?> HandleMissingData(SessionMissingData ex){

        Map<String, String> body = new HashMap<>();
        body.put("error", "MISSING_DATA");
        body.put("message", ex.getMessage());

        return ResponseEntity.badRequest().body(body); // 400
	}
	
	@ExceptionHandler(SessionInvalidField.class)
	public ResponseEntity<?> HandleInvalidField(SessionInvalidField ex){
		Map<String, String> body = new HashMap<>();
		body.put("error", "INVALID_FIELD");
		body.put("message", ex.getMessage());
		
		return ResponseEntity.badRequest().body(body);
	}
}
