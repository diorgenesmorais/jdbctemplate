package com.dms.db.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dms.db.model.Usuario;

@Repository
public class UsuarioRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Usuario> listar() {
		return jdbcTemplate.query("select * from usuario",
				(rs, rowNum) -> new Usuario(rs.getLong("id"), rs.getString("nome"), rs.getString("email")));
	}

	public Usuario buscar(Long id) {
		return jdbcTemplate.queryForObject("select * from usuario where id = ?", new Object[] { id },
				(rs, rowNum) -> new Usuario(rs.getLong("id"), rs.getString("nome"), rs.getString("email")));
	}
}
