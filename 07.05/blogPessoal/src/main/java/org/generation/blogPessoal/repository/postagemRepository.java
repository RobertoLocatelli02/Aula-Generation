package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.tb_postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postagemRepository extends JpaRepository<tb_postagem, Long>{

	public List<tb_postagem> findAllByTituloContainingIgnoreCase (String titulo);
}
