/**
 * 
 */
package com.demo.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@CrossOrigin(origins = "http://localhost:4200")
public class RiesgoController {

	@Autowired
	private RiesgoRepository repository;
	
	/**
	 * Este metodo sirve para listar los registros que estan en la tabla PRI_MATRIZ_RIESGO
	 * @return
	 */
	@GetMapping("/consultarRiesgo")
	public List<Riesgo> ListarRiesgo() {
		return repository.findAll();
	}
	
	 /**
	  * Este metodo sirve para guardar un registro en la tabla PRI_MATRIZ_RIESGO
	  * @param riesgo
	  * @return
	  */
	@PostMapping("/registrarRiesgo")
	public Riesgo guardarRiesgo(@RequestBody Riesgo riesgo) {
		return repository.save(riesgo);
		
	}

}
