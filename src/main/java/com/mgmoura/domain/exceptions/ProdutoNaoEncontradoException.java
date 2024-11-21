package com.mgmoura.domain.exceptions;

import java.util.UUID;

public class ProdutoNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProdutoNaoEncontradoException(UUID id) {
		super("Produto ID " + id + " não encontrado.");
	}

}
