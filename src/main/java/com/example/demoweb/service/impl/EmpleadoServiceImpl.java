package com.example.demoweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoweb.repository.EmpleadoRepoJPA;
import com.example.demoweb.repository.entity.Empleado;
import com.example.demoweb.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	EmpleadoRepoJPA empleadoRepo;
	
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		empleadoRepo.registrar(nombre);
	}

	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return empleadoRepo.findAll();
	}

	@Override
	public List<Empleado> listarFiltroNombre(String cad) {
		// TODO Auto-generated method stub
		return empleadoRepo.listarCuyoNombreContiene(cad);
	}

	@Override
	public List<Empleado> listarConJPA(Integer pId, String contiene) {
		// TODO Auto-generated method stub
		return empleadoRepo.findByIdGreaterThanAndNombreLike(pId, contiene);
	}

	@Override
	public List<Empleado> listarFiltroNombreEs(String cad) {
		// TODO Auto-generated method stub
		return empleadoRepo.listarCuyoNombreEs(cad);
	}
}