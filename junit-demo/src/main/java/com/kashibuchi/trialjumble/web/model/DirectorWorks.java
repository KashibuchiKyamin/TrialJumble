package com.kashibuchi.trialjumble.web.model;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Builder
public class DirectorWorks {
	private String name;
	private String birthDate;
	private String overview;

	private ArrayList<Work> works;

	@ToString
	@Getter
	@Builder
	public static class Work{
		private String workName;
		private String workTypeJa;
		private String yearOfRelease;
		private String position;
		private String memo;

	}

}
