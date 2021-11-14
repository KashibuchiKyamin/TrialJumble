package com.kashibuchi.trialjumble.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kashibuchi.trialjumble.service.DirectorWorksService;
import com.kashibuchi.trialjumble.web.model.DirectorWorks;
import com.kashibuchi.trialjumble.web.model.Directors;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class DirectorController {

	static private Logger LOGGER = LogManager.getLogger(DirectorController.class);

	private DirectorWorksService directorWorksService;


	@GetMapping("/")
	public String getTopPage() {

		Directors directors = directorWorksService.getDirectors();

		LOGGER.debug("response: {}", directors);

		return "director-list";
	}


	@GetMapping("/directorWorks/{directorId}")
	public DirectorWorks getData(@PathVariable("directorId") String directorId) {

		DirectorWorks response = directorWorksService.getDirectorWorksDetail(directorId);

		LOGGER.debug("response: {}", response);

		return response;
	}

}
