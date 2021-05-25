package org.generation.blogPessoal.services;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.tomcat.util.codec.binary.Base64;
import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.tb_usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public tb_usuario cadastrarUsuario(tb_usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);
		return repository.save(usuario);
	}
	
	public Optional<UserLogin> logar(Optional<UserLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<tb_usuario> usuario = repository.findByUsuario(user.get().getUsuario());
		if (usuario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				user.get().setToken(authHeader);
				user.get().setNome(usuario.get().getNome());
				return user;
			}
		} else {
			return null;
		}
		return null;
	}
}
