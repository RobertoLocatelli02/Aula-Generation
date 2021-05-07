package com.minhaLojaDeGames.GamingStore.controller;

import java.util.List;
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
import com.minhaLojaDeGames.GamingStore.model.categoria;
import com.minhaLojaDeGames.GamingStore.repository.categoriaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/categoria")
public class categoriaController {

	@Autowired
	private categoriaRepository repositoryC;
	
	@GetMapping
	ResponseEntity<List<categoria>> findAllCategoria() {
		return ResponseEntity.ok(repositoryC.findAll());
	}
	
	@GetMapping("/id/{id}")
	ResponseEntity<categoria> findByIdCategoria(@PathVariable Long id) {
		return repositoryC.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	ResponseEntity<List<categoria>> findByDescricaoCategoria(@PathVariable String descricao) {
		return ResponseEntity.ok(repositoryC.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	ResponseEntity<categoria> postCategoria(@RequestBody categoria postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryC.save(postagem));
	}
	
	@PutMapping
	ResponseEntity<categoria> putCategoria(@RequestBody categoria postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repositoryC.save(postagem));
	}
	
	@DeleteMapping("/id/{id}")
	void deleteCategoria(@PathVariable Long id) {
		repositoryC.deleteById(id);
	}
}
