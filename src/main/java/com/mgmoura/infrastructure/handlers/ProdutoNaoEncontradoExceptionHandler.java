package com.mgmoura.infrastructure.handlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mgmoura.domain.exceptions.ProdutoNaoEncontradoException;

public class ProdutoNaoEncontradoExceptionHandler {
	
	@ExceptionHandler(ProdutoNaoEncontradoException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public List<String> errorHandler(ProdutoNaoEncontradoException e) {
		
		List<String> errors = new ArrayList<String>();
		
		errors.add(e.getMessage());
		
		return errors;
		}

}
