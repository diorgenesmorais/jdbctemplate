package com.dms.db.model;

public class Usuario {

	private Long id;
	private String nome;
	private String email;

	public Usuario(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "usuario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}

}
