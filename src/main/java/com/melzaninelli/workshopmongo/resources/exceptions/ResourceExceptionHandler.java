package com.melzaninelli.workshopmongo.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.melzaninelli.workshopmongo.service.exception.ObjectNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardErrors> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardErrors err =  new StandardErrors(System.currentTimeMillis(),status.value(), "Não encontrado", request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	
}
