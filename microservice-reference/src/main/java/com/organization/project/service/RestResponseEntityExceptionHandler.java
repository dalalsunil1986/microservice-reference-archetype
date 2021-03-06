package com.organization.project.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.organization.project.bean.TodoNotFoundException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler
		extends ResponseEntityExceptionHandler {
	@ExceptionHandler(TodoNotFoundException.class)
	public final ResponseEntity<Object> todoNotFound(
			TodoNotFoundException ex, WebRequest request) {
		return new ResponseEntity<Object>(ex,
				new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
}