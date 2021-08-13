package com.classes.santech.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classes.santech.entities.Grupo;
import com.classes.santech.entities.Usuario;

public interface GrupoRepository extends JpaRepository <Grupo,Long> {

 

	
}
