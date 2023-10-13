package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
@GetMapping(value="/get")
public String getMsg() {
	return "Web App";
}
}
