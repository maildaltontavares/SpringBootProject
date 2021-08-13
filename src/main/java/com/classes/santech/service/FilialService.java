package com.classes.santech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classes.santech.entities.Filial;
import com.classes.santech.repositories.FilialRepository; 

@Service
public class FilialService {
	
	@Autowired
	private FilialRepository repository;	
	
	public List<Filial> findAll(){
		return repository.findAll();
	}
	
	public  Filial findById(Long id){
		Optional<Filial> obj = repository.findById(id);
		return obj.get();
	}	
	

}
