package com.Mongo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/all")
	public String getAll() {
		return "WHAT ???";
	}
}
