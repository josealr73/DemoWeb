package com.example.demoweb.repository;

import com.example.demoweb.repository.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepoJPA extends JpaRepository<Usuario, String> {

}
