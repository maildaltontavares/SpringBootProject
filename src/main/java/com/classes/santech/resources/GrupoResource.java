package com.classes.santech.resources;

import java.util.List;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classes.santech.entities.Grupo;
import com.classes.santech.entities.Usuario;
import com.classes.santech.service.GrupoService;
import com.classes.santech.service.UsuarioService;

@RestController
@RequestMapping(value = "/grupos")
public class GrupoResource { 
	
	@Autowired
	private GrupoService service;

	@GetMapping
	public ResponseEntity<List<Grupo>> findAll() {
		List<Grupo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping (value="/{id}")
	public ResponseEntity<Grupo> findById(@PathVariable Long id){
		Grupo grupoUsu = service.findById(id);
		return ResponseEntity.ok().body(grupoUsu);   
		
	}
}
