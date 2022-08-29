package com.springboot.crud.resources.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springboot.crud.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException obj,HttpServletRequest hsr){
		String error = "Object not found error";
		HttpStatus http = HttpStatus.NOT_FOUND;
		StandardError se = new StandardError(Instant.now(),http.value(),error,obj.getMessage(),hsr.getRequestURI());
		return ResponseEntity.status(http).body(se);
		
		
	}

}
