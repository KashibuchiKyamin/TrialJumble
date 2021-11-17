package com.kashibuchi.trialjumble.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.scripting.thymeleaf.support.TemplateFilePathProvider;
import org.springframework.stereotype.Repository;

import com.kashibuchi.trialjumble.persistence.domain.Director;

@Repository
@Mapper
public interface DirectorMapper {

	@SelectProvider(TemplateFilePathProvider.class)
	public List<Director> getDirectors();


}
