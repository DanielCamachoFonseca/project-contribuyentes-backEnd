/**
 * 
 */
package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.Riesgo;
import com.demo.project.repository.RiesgoRepository;

/**
 * Clase que establece todas las rutas de la api y sus funcionalidades 
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@RestController
@RequestMapping("/api")
public class RiesgoController {

	@Autowired
	private RiesgoRepository repository;

	@GetMapping("/consultarRiesgo")
	public List<Riesgo> ListarRiesgo() {
		return repository.findAll();

	}

}