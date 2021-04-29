package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.tb_postagem;
import org.generation.blogPessoal.repository.postagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class postagemController {

	@Autowired
	private postagemRepository repository;
	
	@GetMapping
	ResponseEntity<List <tb_postagem>> findAllPostagem() {
		 return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	ResponseEntity<tb_postagem> findByIdPostagem(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	ResponseEntity<List<tb_postagem>> GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	ResponseEntity<tb_postagem> postPostagem(@RequestBody(required = false) tb_postagem postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping
	ResponseEntity<tb_postagem> putPostagem(@RequestBody(required = false) tb_postagem postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	@DeleteMapping("/id/{id}")
	void deletePostagem(@PathVariable long id) {
		repository.deleteById(id);
	}
}
 