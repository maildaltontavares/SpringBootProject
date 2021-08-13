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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table; 
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//@Table(name = "S0001_user")
@Table(name ="\"S0001_usuario\"")
public class Usuario implements Serializable {
  
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "d0001_id", nullable = false)
	private Long id;
	
	@Column(name = "d0001_nome", nullable = false)
	private String nome; 	 	
	
	@Column(name = "d0001_email", nullable = false)
	private String email;

	@Column(name = "d0001_senha", nullable = false)
	private String senha;

	@Column(name = "d0001_tel", nullable = false)
	private String tel;	 
	
	
	//@ManyToMany                                                      /* Chave estrangeira */                                  /* chave da tabela relacionada */
	//@JoinTable(name = "s0003_usuario_grupo", joinColumns = @JoinColumn(name = "d0001_usuario"), inverseJoinColumns = @JoinColumn(name = "d0002_grupo_usuario"))
	//private Set<GrupoUsuario> gruposUsuario = new HashSet<>();
	
	@ManyToMany                                                      /* Chave estrangeira */                                  /* chave da tabela relacionada */
	@JoinTable(name = "\"S0011_USUARIO_GRUPO\"", joinColumns = @JoinColumn(name = "d0001_id"), inverseJoinColumns = @JoinColumn(name = "d0006_id_grupo"))
	private Set<Grupo> gruposUsuario = new HashSet<>();	
	
	
	@ManyToOne
	@JoinColumn(name ="d0001_filial_default")
	private  Filial  filialPadraoUsuario; 	
	  
	public Filial getFilialPadraoUsuario() {
		return filialPadraoUsuario;
	}

	public Usuario() {
	}
	
	public Usuario(Long id, String nome, String email, String senha, String tel) {
	 
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.tel = tel;
	}

	 
	public Set<Grupo> getGrupoUsuario() {
		return gruposUsuario;
	}	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "usuario [id=" + id + ", nome=" + nome + "]";
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
