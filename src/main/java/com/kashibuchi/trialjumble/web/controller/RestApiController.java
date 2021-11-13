package com.kashibuchi.trialjumble.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kashibuchi.trialjumble.service.DirectorWorksService;
import com.kashibuchi.trialjumble.web.model.DirectorWorks;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class RestApiController {


	private DirectorWorksService directorWorksService;

	@GetMapping("/")
	public DirectorWorks getData(){

		return directorWorksService.getDirectorWorksDetail("D0000001");
	}

}
