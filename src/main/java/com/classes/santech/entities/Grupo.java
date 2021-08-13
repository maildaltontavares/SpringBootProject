package com.classes.santech.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

 
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//@Table(name = "S0002_grupo_usuario")
@Table(name = "\"S0006_GRUPO\"")
public class Grupo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "d0002_id_grupo_usu", nullable = false)
	@Column(name = "d0006_id_grupo", nullable = false)
	private Long id;
	
	public Grupo() {}
	
	public Grupo(Long id, String cod_grupo, String desc_grupo) {

		this.id = id;
		//this.cod_grupo = cod_grupo;
		this.desc_grupo = desc_grupo;
	}
	//@Column(name = "d0002_cod_grupo_usu", nullable = false)	
	//@Column(name = "d0006_id_grupo", nullable = false)
	//private String cod_grupo;
	
	//@Column(name = "d0002_desc_grupo_usu", nullable = false)		
	@Column(name = "d0006_desc_grupo", nullable = false)
	private String desc_grupo;
	
 
	@JsonIgnore
	@ManyToMany(mappedBy = "gruposUsuario")
	private Set<Usuario> usuarios = new HashSet<>();	
	
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	//public String getCod_grupo() {
	//	return cod_grupo;
	//}
	//public void setCod_grupo(String cod_grupo) {
	//	this.cod_grupo = cod_grupo;
	//}
	public String getDesc_grupo() {
		return desc_grupo;
	}
	public void setDesc_grupo(String desc_grupo) {
		this.desc_grupo = desc_grupo;
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
		Grupo other = (Grupo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GrupoUsuario [  desc_grupo=" + desc_grupo + "]";
	}
	
	
	
}
