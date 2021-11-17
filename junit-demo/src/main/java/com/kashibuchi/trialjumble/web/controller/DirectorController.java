package com.kashibuchi.trialjumble.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kashibuchi.trialjumble.service.DirectorService;
import com.kashibuchi.trialjumble.web.model.Directors;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class DirectorController {

	static private Logger LOGGER = LogManager.getLogger(DirectorController.class);

	private DirectorService directorService;


	@GetMapping("/")
	public ModelAndView getTopPage(ModelAndView mv) {

		Directors directors = directorService.getDirectors();

		LOGGER.debug("response: {}", directors);

		mv.setViewName("director-list");
		mv.addObject("directors", directors);

		return mv;
	}

}
