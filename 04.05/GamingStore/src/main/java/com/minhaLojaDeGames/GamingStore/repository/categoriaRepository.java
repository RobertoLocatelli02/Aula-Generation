package com.minhaLojaDeGames.GamingStore.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.minhaLojaDeGames.GamingStore.model.categoria;

public interface categoriaRepository extends JpaRepository<categoria, Long> {
	List<categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}
