package com.kashibuchi.trialjumble.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kashibuchi.trialjumble.persistence.domain.DirectorWork;
import com.kashibuchi.trialjumble.persistence.mapper.DirectorWorksMapper;
import com.kashibuchi.trialjumble.web.model.DirectorWorks;
import com.kashibuchi.trialjumble.web.model.DirectorWorks.DirectorWorksBuilder;
import com.kashibuchi.trialjumble.web.model.DirectorWorks.Work;
import com.kashibuchi.trialjumble.web.model.DirectorWorks.Work.WorkBuilder;

/**
 * @author KashibuchiPractice
 *
 */
@Service
public class DirectorWorksService {

	/**
	 * 監督の作品データリポジトリ.
	 * 不本意ながらフィールドインジェクションした。
	 */
	@Autowired
	private DirectorWorksMapper directorWorksMapper;

	/**
	 * 監督IDを元に作品データを取得して、整形の上返却
	 * @param directorId 監督ID
	 * @return ViewにセットするためのDirectorWorks
	 */
	public DirectorWorks getDirectorWorksDetail(String directorId) {

		List<DirectorWork> workDetails = directorWorksMapper.getWorkDetails(directorId);

		return createResponseData(workDetails);
	}

	/**
	 * 無理矢理作ったprivateメソッド
	 * @param workDetails
	 * @return Viewにそのままセットして使用できるDirectorWorks
	 */
	private DirectorWorks createResponseData(List<DirectorWork> workDetails) {
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
