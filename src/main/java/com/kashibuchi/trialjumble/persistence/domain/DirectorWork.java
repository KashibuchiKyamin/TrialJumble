package com.kashibuchi.trialjumble.persistence.domain;

import lombok.Data;

@Data
public class DirectorWork {
	/*
	 d.name
	,d.birth_date
	,d.overview
	,w.work_name
	,wk.work_type_ja
	,w.year_of_release
	,w.position
	,w.memo
	*/

	private String name;
	private String birthDate;
	private String overview;
	private String workName;
	private String workTypeJa;
	private String yearOfRelease;
	private String position;
	private String memo;
}
