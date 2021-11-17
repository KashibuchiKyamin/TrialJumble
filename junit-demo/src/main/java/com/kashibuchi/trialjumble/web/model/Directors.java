package com.kashibuchi.trialjumble.web.model;

import java.util.List;

import com.kashibuchi.trialjumble.persistence.domain.Director;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Directors {

	private int count;
	private List<Director> directors;

	public Directors(List<Director> directors){
		this.directors = directors;
		this.count = directors.size();
	}

}
