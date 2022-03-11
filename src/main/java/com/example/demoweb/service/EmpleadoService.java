package com.example.demoweb.service;

import java.util.List;

import com.example.demoweb.repository.entity.Empleado;

public interface EmpleadoService {
	public void registrar(String nombre);
	public List<Empleado> listar();
}
