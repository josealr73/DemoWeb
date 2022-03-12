package com.example.demoweb.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demoweb.repository.entity.Empleado;

@Repository
public interface EmpleadoRepo{
	public void registrar (String nombre);
	List<Empleado> listarCuyoNombreContiene(String texto_nombre);
}