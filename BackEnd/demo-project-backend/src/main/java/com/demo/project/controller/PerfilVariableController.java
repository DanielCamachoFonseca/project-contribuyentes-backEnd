/**
 * 
 */
package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.project.entity.PerfilVariable;
import com.demo.project.repository.PerfilVariableRepository;


/**
 * Clase que establece todas las rutas de la api y sus funcionalidades 
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PerfilVariableController {

	@Autowired 
	private PerfilVariableRepository repository;
	

	@GetMapping("/consultarPerfilVariable")
	public List<PerfilVariable> ListarPerfilVariable(){
		return repository.findAll();
	}
		
	
}
