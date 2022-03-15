package com.example.demoweb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoweb.repository.entity.Empleado;
import com.example.demoweb.service.EmpleadoService;

@RestController
@RequestMapping ("/api/empleados")
public class EmpleadosRestController {
	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping
	@Cacheable(value="empleados")
	public List<Empleado> listarEmpleados(){
		try {
			Thread.sleep(1500);
		}catch(InterruptedException e) {
			
		}
		
		return empleadoService.listar();
	}
	
	@PostMapping
	@CacheEvict (value="empleados", allEntries=true)
	public void insertarEmpleado (@RequestBody Empleado emp) {
		empleadoService.inserta(emp);
	}
	
	@PutMapping
	@CacheEvict (value="empleados", allEntries=true)
	public Empleado modificarEmpleado (@RequestBody Empleado emp) {
		return empleadoService.modificar(emp);
	}
	
	@DeleteMapping (value="/{id}")
	@CacheEvict (value="empleados", allEntries=true)
	public void eliminarEmpleado(@PathVariable("id") Integer id) {
		empleadoService.eliminar(id);
	}
	
	@GetMapping (value="/{id}")
	public ResponseEntity<Empleado> devuelveEmpleado(@PathVariable("id") Integer id){
		Empleado emp = empleadoService.getById(id);
		if(emp == null) {
			return new ResponseEntity<> (null, HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<> (emp, HttpStatus.OK);
		}
	}
	
}
