package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.tb_tema;
import org.generation.blogPessoal.repository.temaRepository;
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
@RequestMapping("/tema")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class temaController {

	@Autowired
	private temaRepository repository;
	
	@GetMapping
	ResponseEntity<List<tb_tema>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	ResponseEntity<tb_tema> getById(@PathVariable  Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	ResponseEntity<List<tb_tema>> getByName(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(nome));
	}

	@PostMapping
	ResponseEntity<tb_tema> post (@RequestBody tb_tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
	}
	
	@PutMapping
	ResponseEntity<tb_tema> put (@RequestBody tb_tema tema) {
		return ResponseEntity.ok(repository.save(tema));
	}
	
	@DeleteMapping("/id/{id}")
	void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}