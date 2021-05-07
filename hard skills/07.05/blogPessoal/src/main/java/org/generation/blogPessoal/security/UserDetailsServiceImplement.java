package org.generation.blogPessoal.security;

import java.util.Optional;
import org.generation.blogPessoal.model.tb_usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplement implements UserDetailsService {

	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<tb_usuario> user = userRepository.findByUsuario(username);
		user.orElseThrow( () -> new UsernameNotFoundException(username + " not found."));
		return user.map(UserDetailsImplement :: new).get();
	}
}
