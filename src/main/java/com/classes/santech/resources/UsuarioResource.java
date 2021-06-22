package com.classes.santech.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classes.santech.entities.usuario;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<usuario> findAll() {
		usuario u = new usuario(1L, "Dalton", "dlt@uol.com", "AAA", "98745621");
		return ResponseEntity.ok().body(u);
	}
	
}
