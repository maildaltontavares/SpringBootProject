package com.classes.santech.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "\"E0006_FILIAL\"")
 
public class Filial implements Serializable {

	
	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "d0006_id_filial", nullable = false)	
	private Long id;  

	@Column(name = "d0006_nome_filial", nullable = false)
	private String nome_filial;
 
	@JsonIgnore
	@OneToMany(mappedBy = "filialPadraoUsuario")
	private List<Usuario> usuarios = new ArrayList<>();	
	  
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public Filial() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_filial() {
		return nome_filial;
	}

	public void setNome_filial(String nome_filial) {
		this.nome_filial = nome_filial;
	}

	public Filial(Long id, String nome_filial ) { 
		this.id = id;
		this.nome_filial = nome_filial; 
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filial other = (Filial) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
	@Override
	public String toString() {
		return "Filial [id=" + id + ", nome_filial=" + nome_filial + "]";
	}
	
}
