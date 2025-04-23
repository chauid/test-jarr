package com.jarr;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	@GetMapping
	public ResponseEntity<Object> get() {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("message", "Hello World");
		response.put("status", "success");
		response.put("code", 200);
		response.put("data", null);
		return ResponseEntity.ok(response);
	}
}
