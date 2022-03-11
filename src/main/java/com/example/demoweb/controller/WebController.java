package com.example.demoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoweb.service.EmpleadoService;

@Controller
public class WebController {

	@Autowired
	EmpleadoService empleadoService;
	
 	@GetMapping("/saludo")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Mundo") 
							String nombre, Model model) {
		model.addAttribute("name", nombre);
		empleadoService.registrar(nombre);
		return "hola";
	}
 	
 	@GetMapping("/listarEmpleados")
 	public String listarEmp(Model model) {
 		model.addAttribute("listaEmp", empleadoService.listar());
 		return "listarEmp";
 	}
	
 	@GetMapping("/error")
 	public String errorPage() {
 		return "Error";
 	}
 	
}
