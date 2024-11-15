package com.mgmoura.domain.exceptions;

import java.util.UUID;

public class ProdutoNaoEncontradoException extends RuntimeException {
	public ProdutoNaoEncontradoException(UUID id) {
		super("Produto ID " + id + " não encontrado.");
	}

}
