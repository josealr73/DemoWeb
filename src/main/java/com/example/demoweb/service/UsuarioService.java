package com.example.demoweb.service;

import java.util.List;

import com.example.demoweb.repository.entity.Usuario;

public interface UsuarioService {
	List<Usuario> listar();
	Usuario buscarPorUsername(String username);
}
