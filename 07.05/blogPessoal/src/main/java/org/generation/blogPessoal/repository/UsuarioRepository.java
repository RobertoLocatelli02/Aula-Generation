package org.generation.blogPessoal.repository;

import java.util.Optional;

import org.generation.blogPessoal.model.tb_usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<tb_usuario, Long>{

	Optional<tb_usuario> findByUsuario (String usuario);
}
