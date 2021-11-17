package com.kashibuchi.trialjumble.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.scripting.thymeleaf.support.TemplateFilePathProvider;
import org.springframework.stereotype.Repository;

import com.kashibuchi.trialjumble.persistence.domain.DirectorWork;

@Repository
@Mapper
public interface DirectorWorksMapper {
	@SelectProvider(TemplateFilePathProvider.class)
	public List<DirectorWork> getWorkDetails(@Param("directorId") String directorId);

}
