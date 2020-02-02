package com.uls.caroccupationtool.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.uls.caroccupationtool.exception.custom.NotFoundException;
import com.uls.caroccupationtool.model.response.ErrorMessageResponse;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = {NotFoundException.class})
	public ResponseEntity<Object> notFoundException(NotFoundException ex, WebRequest req) {
		ErrorMessageResponse errMsg = new ErrorMessageResponse(new Date(), ex.getMessage());
		return new ResponseEntity<>(errMsg, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
	
	
}
