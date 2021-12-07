package com.kashibuchi.trialjumble.web.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kashibuchi.trialjumble.web.model.Response;

@RestController
@RequestMapping("basepath")
public class MainController {

	@GetMapping("target")
	public Response getResponse() {
		return new Response("20000", "success", LocalDateTime.now());
	}

}
