package com.minhaLojaDeGames.GamingStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.GamingStore.model.produto;

public interface produtoRepository extends JpaRepository<produto, Long>{
	List<produto> findAllByDescricaoAndTituloContainingIgnoreCase (String descricao, String titulo);
}
