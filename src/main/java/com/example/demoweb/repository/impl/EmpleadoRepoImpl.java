package com.example.demoweb.repository.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.example.demoweb.repository.EmpleadoRepo;
import com.example.demoweb.repository.entity.Empleado;

@Repository
public class EmpleadoRepoImpl implements EmpleadoRepo{
	private static Logger LOG = org.slf4j.LoggerFactory.getLogger(EmpleadoRepoImpl.class);
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void registrar (String nombre) {
		LOG.info("Se ha saludado al empleado: "+nombre);
	}


	//@Override
	public List<Empleado> listarCuyoNombreContiene(String texto_nombre){
		Query query = entityManager.createNativeQuery("SELECT * FROM empleado " + "WHERE nombre LIKE ?", Empleado.class);
		query.setParameter(1, "%" + texto_nombre + "%");
		return query.getResultList();
	}
}
