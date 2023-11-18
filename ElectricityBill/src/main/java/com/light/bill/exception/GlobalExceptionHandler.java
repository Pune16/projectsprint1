package com.light.bill.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidations(MethodArgumentNotValidException ex) {
		Map<String, String> errorMap = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach((error)-> {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(ConsumerNotFoundException.class)
	public Map<String, String> handleEmployeeNotFound(ConsumerNotFoundException ex) {
		Map<String, String> errorMap = new HashMap<>();
		
		errorMap.put("errorMsg", ex.getMessage());
		return errorMap;
	}
}