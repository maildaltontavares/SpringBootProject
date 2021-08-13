package com.classes.santech.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.classes.santech.entities.Grupo;
import com.classes.santech.entities.Usuario;
import com.classes.santech.repositories.GrupoRepository;
import com.classes.santech.repositories.UsuarioRepository;
 

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@Autowired
	private GrupoRepository grupoUserRepository;	
 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 /*		
		Usuario u1 = new Usuario(null, "Dalton", "dlt@uol.com", "AAA" , "98745621");
		Usuario u2 = new Usuario(null, "Joao", "joao@uol.com"  , "AAZZA"  , "65326218");
		Usuario u3 = new Usuario(null, "Antonio Carlos", "antcarlos@uol.com", "adsdaf", "9665874"); 
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		
		GrupoUsuario g1 = new GrupoUsuario(null,"G001" , "Administrador do Sistema");
		GrupoUsuario g2 = new GrupoUsuario(null,"G002" , "Somente Tabelas");
		GrupoUsuario g3 = new GrupoUsuario(null,"G003" , "Movimentador de Material");		
		
		grupoUserRepository.saveAll(Arrays.asList(g1,g2,g3));

		u1.getGrupoUsuario().add(g1);
		u1.getGrupoUsuario().add(g2);
		u1.getGrupoUsuario().add(g3);
		
		u2.getGrupoUsuario().add(g1);
		u2.getGrupoUsuario().add(g2);
		
		u3.getGrupoUsuario().add(g3);
		u3.getGrupoUsuario().add(g1);
	
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		
		*/	 
		
		 
		 
		
	}
	
	
	

}
