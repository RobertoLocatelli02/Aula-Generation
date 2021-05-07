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
import com.minhaLojaDeGames.GamingStore.model.produto;
import com.minhaLojaDeGames.GamingStore.repository.produtoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class produtoController {

	@Autowired
	private produtoRepository repositoryP;
	
	@GetMapping
	ResponseEntity<List<produto>> findAllProduto() {
		return ResponseEntity.ok(repositoryP.findAll());
	}
	
	@GetMapping("/id/{id}")
	ResponseEntity<produto> findByIdProduto(@PathVariable Long id) {
		return repositoryP.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	ResponseEntity<List<produto>> findByDescricaoAndTitulo(@PathVariable String descricao, String titulo) {
		return ResponseEntity.ok(repositoryP.findAllByDescricaoAndTituloContainingIgnoreCase(descricao, titulo));
	}
	
	@PostMapping
	ResponseEntity<produto> postProduto(@RequestBody produto postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryP.save(postagem));
	}
	
	@PutMapping
	ResponseEntity<produto> putProduto(@RequestBody produto postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repositoryP.save(postagem));
	}
	
	@DeleteMapping("/id/{id}")
	void deleteProduto(@PathVariable Long id) {
		repositoryP.deleteById(id);
	}
}
