package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.tb_tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface temaRepository extends JpaRepository<tb_tema, Long>{

	List<tb_tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
