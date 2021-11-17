package com.kashibuchi.trialjumble.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kashibuchi.trialjumble.persistence.domain.DirectorWork;
import com.kashibuchi.trialjumble.persistence.mapper.DirectorWorksMapper;
import com.kashibuchi.trialjumble.web.model.DirectorWorks;
import com.kashibuchi.trialjumble.web.model.DirectorWorks.DirectorWorksBuilder;
import com.kashibuchi.trialjumble.web.model.DirectorWorks.Work;
import com.kashibuchi.trialjumble.web.model.DirectorWorks.Work.WorkBuilder;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DirectorWorksService {

	private DirectorWorksMapper directorWorksMapper;

	public DirectorWorks getDirectorWorksDetail(String directorId) {

		List<DirectorWork> workDetails = directorWorksMapper.getWorkDetails(directorId);

		DirectorWorksBuilder builder = DirectorWorks.builder();

		Optional<DirectorWork> parsonalData = workDetails.stream().findFirst();
		parsonalData.ifPresentOrElse(
				data -> builder.name(data.getName()).birthDate(data.getBirthDate()).overview(data.getOverview())
				,() -> builder.name("").birthDate("").overview(""));

		ArrayList<Work> works = new ArrayList<DirectorWorks.Work>();
		for (DirectorWork directorWork : workDetails) {

			WorkBuilder workBuilder = DirectorWorks.Work.builder();
			workBuilder.workName(directorWork.getWorkName())
					.workTypeJa(directorWork.getWorkTypeJa())
					.yearOfRelease(directorWork.getYearOfRelease())
					.position(directorWork.getPosition())
					.memo(directorWork.getMemo());
			works.add(workBuilder.build());
		}

		builder.works(works);

		return builder.build();
	}

}
