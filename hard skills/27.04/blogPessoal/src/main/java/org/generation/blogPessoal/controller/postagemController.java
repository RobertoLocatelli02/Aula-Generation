package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.tb_postagem;
import org.generation.blogPessoal.repository.postagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class postagemController {

	@Autowired
	private postagemRepository repository;
	
	@GetMapping
	ResponseEntity<List <tb_postagem>> GetAll() {
		 return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	ResponseEntity<tb_postagem> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	ResponseEntity<List<tb_postagem>> GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
}
 