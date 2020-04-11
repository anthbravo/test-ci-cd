package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Test;
import com.test.service.TestService;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping()
	public ResponseEntity<List<Test>> hearbeat() {

		List<Test> tests = testService.getAll();
		if (tests.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(tests);
		}

	}
}
