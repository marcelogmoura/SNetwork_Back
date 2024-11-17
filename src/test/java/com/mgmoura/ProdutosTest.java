package com.mgmoura;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.mgmoura.domain.dtos.AtualizarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoRequestDto;
import com.mgmoura.domain.dtos.CriarProdutoResponseDto;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProdutosTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper mapper;

	private static UUID produto;

	@Test
	@Order(1)
	public void testProdutosPost() throws Exception{
		
		Faker faker = new Faker();
		
		CriarProdutoRequestDto dto = new CriarProdutoRequestDto();
		
		dto.setNome(faker.commerce().productName());
		dto.setPreco(Double.valueOf(faker.number().randomNumber(4 , false)));
		dto.setQuantidade(faker.number().numberBetween(1 , 20));
		dto.setEan(faker.number().numberBetween(10000 , 99999));
		
		MvcResult result = mockMvc.perform
				(post("/api/produtos")
				.contentType("application/json")
				.content(mapper.writeValueAsString(dto)))
				.andExpect(status().isCreated())
				.andReturn();
		
		String responseBody = result.getResponse().getContentAsString();
		
		CriarProdutoResponseDto response = mapper.readValue(responseBody, CriarProdutoResponseDto.class);
		
		produto = response.getId();
	}

	@Test
	@Order(2)
	public void testProdutosPut() throws Exception {
		
		if (produto == null) {
	        testProdutosPost();
	    }
		
		Faker faker = new Faker();
		
		AtualizarProdutoRequestDto dto = new AtualizarProdutoRequestDto();
		
		dto.setNome(faker.commerce().productName());
		dto.setPreco(Double.valueOf(faker.number().randomNumber(4 , false)));
		dto.setQuantidade(faker.number().numberBetween(1 , 20));
		dto.setEan(faker.number().numberBetween(10000 , 99999));
		
		mockMvc.perform(put("/api/produtos/" + produto.toString())   
				.contentType("application/json")
				.content(mapper.writeValueAsString(dto)))
				.andExpect(status().isOk());
		
		
	}

	@Test
	@Order(3)
	public void testProdutosGetAll() throws Exception{
		mockMvc.perform(get("/api/produtos"))
		.andExpect(status().isOk());
	}

	@Test
	@Order(4)
	public void testProdutosGetById() throws Exception{
		mockMvc.perform(get("/api/produtos")).andExpect(status().isOk());
		
	}

	@Test
	@Order(5)
	public void testProdutosDelete() throws Exception{
		
		testProdutosPost();
		
		mockMvc.perform(delete("/api/produtos/" + produto.toString()))
        .andExpect(status().isOk());
		
	}

}
