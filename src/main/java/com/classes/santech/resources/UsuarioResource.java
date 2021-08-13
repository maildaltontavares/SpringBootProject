package com.classes.santech.resources;

import java.util.List;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.classes.santech.entities.Usuario;
import com.classes.santech.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource { 
	
	@Autowired
	private UsuarioService service;

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping (value="/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id){
		Usuario usu = service.findById(id);
		return ResponseEntity.ok().body(usu);   
		
	}
	
	@PostMapping
	public ResponseEntity<Usuario> insert(@RequestBody Usuario obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}	
	
/*	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping (value = "/{id}")
	public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody Usuario obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}		
	*/
	
}
