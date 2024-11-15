package com.mgmoura.infrastructure.handlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mgmoura.domain.exceptions.EanJaCadastradoException;

@ControllerAdvice
public class EanJaCadastradoExceptionHandler {
	
	@ExceptionHandler(EanJaCadastradoException.class)
	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	@ResponseBody
	public List<String> errorHandler(EanJaCadastradoException e) {
		List<String> errors = new ArrayList<String>();
		errors.add(e.getMessage());
		return errors;
		}

}
