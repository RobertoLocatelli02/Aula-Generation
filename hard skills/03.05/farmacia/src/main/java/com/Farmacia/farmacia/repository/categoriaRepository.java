package com.Farmacia.farmacia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Farmacia.farmacia.model.categoria;

@Repository
public interface categoriaRepository extends JpaRepository<categoria, Long>{
	List<categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}
