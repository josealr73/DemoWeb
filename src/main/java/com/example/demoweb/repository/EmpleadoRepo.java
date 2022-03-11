package com.example.demoweb.repository;

import com.example.demoweb.repository.entity.Empleado;

public interface EmpleadoRepo extends JpaRepository{
	public void registrar (String nombre);
	
}
