package com.classes.santech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classes.santech.entities.Grupo;
import com.classes.santech.repositories.GrupoRepository;
 

@Service
public class GrupoService {
 
	
	@Autowired
	private GrupoRepository repository;
	
	public List<Grupo> findAll(){
		return repository.findAll();
	}
	
	public  Grupo findById(Long id){
		Optional<Grupo> obj = repository.findById(id);
		return obj.get();
	}	
}
