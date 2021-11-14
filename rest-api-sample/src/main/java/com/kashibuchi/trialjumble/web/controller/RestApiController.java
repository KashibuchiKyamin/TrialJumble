package com.kashibuchi.trialjumble.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kashibuchi.trialjumble.service.DirectorWorksService;
import com.kashibuchi.trialjumble.web.model.DirectorWorks;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class RestApiController {

	static private Logger LOGGER = LogManager.getLogger(RestApiController.class);

	private DirectorWorksService directorWorksService;

	@GetMapping("/directorWorks/{directorId}")
	public DirectorWorks getData(@PathVariable("directorId") String directorId) {

		DirectorWorks response = directorWorksService.getDirectorWorksDetail(directorId);

		LOGGER.debug("response: {}", response);

		return response;
	}

}
