package org.generation.blogPessoal.controller;

import java.util.Optional;

import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.tb_usuario;
import org.generation.blogPessoal.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/logar")
	ResponseEntity<UserLogin> login(@RequestBody Optional<UserLogin> user){
		return usuarioService.logar(user).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	ResponseEntity<tb_usuario> signin(@RequestBody tb_usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.cadastrarUsuario(usuario));
	}
}
