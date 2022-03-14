package com.example.demoweb.service;

import java.util.List;

import com.example.demoweb.repository.entity.Empleado;

public interface EmpleadoService {
	void registrar(String nombre);
	List<Empleado> listar();
	List<Empleado> listarFiltroNombre(String cad);
	List<Empleado> listarConJPA(Integer pId, String contiene);
	List<Empleado> listarFiltroNombreEs(String cad);
	Empleado inserta(Empleado emp);
}
