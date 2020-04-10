package com.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heartbeat")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class HeartbeatController {

	@GetMapping()
	public ResponseEntity<String> hearbeat() {

		return ResponseEntity.ok("PUM PUM");

	}
}
