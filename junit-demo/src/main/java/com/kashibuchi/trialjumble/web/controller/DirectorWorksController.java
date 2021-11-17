package com.kashibuchi.trialjumble.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.kashibuchi.trialjumble.service.DirectorWorksService;
import com.kashibuchi.trialjumble.web.model.DirectorWorks;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class DirectorWorksController {

	static private Logger LOGGER = LogManager.getLogger(DirectorWorksController.class);

	private DirectorWorksService directorWorksService;

	@GetMapping("/directorWorks/{directorId}")
	public ModelAndView getData(@PathVariable("directorId") String directorId, ModelAndView mv) {

		DirectorWorks response = directorWorksService.getDirectorWorksDetail(directorId);

		LOGGER.debug("response: {}", response);

		mv.setViewName("director-detail");
		mv.addObject("directorWorks", response);
		return mv;
	}

}
