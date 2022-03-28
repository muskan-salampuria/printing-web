package com.epam.printing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class RestControllerExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, WebRequest req) {
		return new ResponseEntity<>(ex.toString(), HttpStatus.BAD_REQUEST);
	}

}
