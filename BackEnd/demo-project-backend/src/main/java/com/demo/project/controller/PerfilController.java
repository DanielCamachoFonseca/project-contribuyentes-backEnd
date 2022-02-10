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

import com.demo.project.entity.Perfil;
import com.demo.project.repository.PerfilRepository;

/**
 * Clase que establece todas las rutas de la api y sus funcionalidades 
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PerfilController {
	
	@Autowired
	private PerfilRepository repository;
	
	@GetMapping("/consultarPerfil")
	public List<Perfil> ListarPerfil(){
		return repository.findAll();
	}
	
	

}
