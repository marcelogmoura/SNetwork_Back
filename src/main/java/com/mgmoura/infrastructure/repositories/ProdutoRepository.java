package com.mgmoura.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mgmoura.domain.entities.Produto;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, UUID>{

	@Query("{ 'ean' : ?0 }")
	Produto findByEAN(Integer integer);
}
