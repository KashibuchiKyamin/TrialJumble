package com.kashibuchi.trialjumble.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kashibuchi.trialjumble.persistence.domain.Director;
import com.kashibuchi.trialjumble.persistence.mapper.DirectorMapper;
import com.kashibuchi.trialjumble.web.model.Directors;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DirectorService {

	private DirectorMapper directorMapper;

	public Directors getDirectors() {

		List<Director> directors = directorMapper.getDirectors();

		return new Directors(directors);
	}

}
