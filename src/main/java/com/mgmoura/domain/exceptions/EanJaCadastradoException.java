package com.mgmoura.domain.exceptions;

public class EanJaCadastradoException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public EanJaCadastradoException() {
		super ("EAN já cadastrado, verifique.");
	}

}
