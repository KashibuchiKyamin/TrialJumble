package com.kashibuchi.trialjumble.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.kashibuchi.trialjumble.persistence.domain.DirectorWork;
import com.kashibuchi.trialjumble.persistence.mapper.DirectorWorksMapper;
import com.kashibuchi.trialjumble.web.model.DirectorWorks;
import com.kashibuchi.trialjumble.web.model.DirectorWorks.Work;

class DirectorWorksServiceTest {

	/**
	 * 不本意ながらフィールドインジェクションにしたMapper.
	 * わざわざMockにする必要があるのでテストソースの可読性が下がる。
	 * Mockを理解しなきゃならん。
	 */
	@Mock
	DirectorWorksMapper directorWorksMapper;

	/**
	 * テスト対象のオブジェクト.
	 */
	@InjectMocks
	DirectorWorksService target = new DirectorWorksService();

	/**
	 * 繰り返し実行される準備用のメソッド
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
	}

	/**
	 * DisplayNameに書ききれない試験の詳細はここに書けばいいんじゃないかな。
	 */
	@DisplayName("データ1件分のヒット - レスポンスデータに意図した値が入っているか")
	@Test
	void testGetDirectorWorksDetail() {

		ArrayList<DirectorWork> mockReturn = new ArrayList<DirectorWork>();
		mockReturn.add(new DirectorWork("あああ", "1987-07-22", "概要", "作品1", "テレビアニメ", "2021年", "制作", "超面白い"));

		when(directorWorksMapper.getWorkDetails("D0000002")).thenReturn(mockReturn);

		DirectorWorks actual = target.getDirectorWorksDetail("D0000002");

		//assertEqualsにしたけどassertThatとMatcherが今時らしいですよ。
		assertAll(
				() -> assertEquals("あああ", actual.getName()),
				() -> assertEquals("1987-07-22", actual.getBirthDate()),
				() -> assertEquals("概要", actual.getOverview()),
				() -> {
					ArrayList<Work> works = actual.getWorks();
					for (Work work : works) {
						assertAll(
								() -> assertEquals("作品1", work.getWorkName()),
								() -> assertEquals("テレビアニメ", work.getWorkTypeJa()),
								() -> assertEquals("2021年", work.getYearOfRelease()),
								() -> assertEquals("制作", work.getPosition()),
								() -> assertEquals("超面白い", work.getMemo()));
					}
				});

	}

	//TODO: privateメソッドの試験
	//参考(https://qiita.com/village/items/2f0d99b25eef0c8fd4ec)

}
