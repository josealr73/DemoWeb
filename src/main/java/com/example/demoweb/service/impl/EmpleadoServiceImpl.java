package com.example.demoweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoweb.repository.EmpleadoRepo;
import com.example.demoweb.repository.entity.Empleado;
import com.example.demoweb.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadoRepo empleadoRepo;
	
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		empleadoRepo.registrar(nombre);
	}

	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
