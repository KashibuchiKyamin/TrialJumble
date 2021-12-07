package com.kashibuchi.trialjumble.web.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
	private String resultCode;
	private String resultMessage;
	private LocalDateTime resultDateTime;
}
