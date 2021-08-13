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

import com.classes.santech.entities.Filial;
import com.classes.santech.service.FilialService;
 

@RestController
@RequestMapping(value = "/filiais")
public class FilialResource {
	
	@Autowired
	private FilialService service;

	@GetMapping
	public ResponseEntity<List<Filial>> findAll() {
		List<Filial> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping (value="/{id}")
	public ResponseEntity<Filial> findById(@PathVariable Long id){
		Filial FilialUsu = service.findById(id);
		return ResponseEntity.ok().body(FilialUsu);   
		
	}
}