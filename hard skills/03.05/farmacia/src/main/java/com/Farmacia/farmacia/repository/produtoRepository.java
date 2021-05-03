package com.Farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Farmacia.farmacia.model.produto;

@Repository
public interface produtoRepository extends JpaRepository<produto, Long>{
	List<produto> findAllByDescricaoAndTituloContainingIgnoreCase(String descricao, String titulo);
}
