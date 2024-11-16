package com.mgmoura.application.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgmoura.domain.dtos.CriarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoResponseDto;
import com.mgmoura.domain.entities.Produto;
import com.mgmoura.domain.interfaces.ProdutoDomainService;
import com.mgmoura.infrastructure.repositories.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoDomainService produtoDomainService;

	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping()
	public ResponseEntity<?> criar(@RequestBody @Valid CriarProdutoRequestDto dto) {
		CriarProdutoResponseDto response = produtoDomainService.criar(dto);
		return ResponseEntity.status(201).body(response);

	}

	@PutMapping("/{id}")
	public ResponseEntity<CriarProdutoResponseDto> editar(@PathVariable UUID id,
			@RequestBody @Valid CriarProdutoRequestDto dto) {
		CriarProdutoResponseDto response = produtoDomainService.editar(id, dto);
		return ResponseEntity.status(200).body(response);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable UUID id) {
		produtoDomainService.deletar(id);		
		return ResponseEntity.status(200).body("Produto excluido");
	}

	@GetMapping
	public List<Produto> get() {
		return produtoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Produto getById(@PathVariable("id") UUID id) {		
		Optional<Produto> produto = produtoRepository.findById(id);		
		if(produto.isPresent()) {
			return produto.get();
		}else {
			return null;
		}
		
	}
	
}
