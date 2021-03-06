/**
 * 
 */
package com.demo.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.Riesgo;
import com.demo.project.exceptions.ResourceNotFoundExceptions;
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
		
	/**
	 * Este metodo sirve para buscar un registro por ID
	 * @param id
	 * @return
	 */
	@GetMapping("/buscarRiesgo/{id}")
	public ResponseEntity<Riesgo> ObtenerRiesgoPorId(@PathVariable Long id){
		Riesgo riesgo = repository.findById(id)
						.orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
		return ResponseEntity.ok(riesgo);
		
	}
	
	/**
	 * Este metodo sirve para actualizar un registro de la entidad riesgo
	 * @param id
	 * @param detallesRiesgo
	 * @return
	 */
	
	@PutMapping("/actualizarRiesgo/{id}")
	public ResponseEntity<Riesgo> actualizarRiesgo(@PathVariable Long id, @RequestBody Riesgo detallesRiesgo){
		Riesgo riesgo = repository.findById(id)
						.orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
		riesgo.setNombre(detallesRiesgo.getNombre());	
		riesgo.setFecha_desde(detallesRiesgo.getFecha_desde());
		riesgo.setFecha_hasta(detallesRiesgo.getFecha_hasta());
		riesgo.setEstado(detallesRiesgo.getEstado());
		riesgo.setUsuario_auditoria(detallesRiesgo.getUsuario_auditoria());
		riesgo.setFecha_auditoria(detallesRiesgo.getFecha_auditoria());
		
		Riesgo riesgoActualizado = repository.save(riesgo);		
		return ResponseEntity.ok(riesgoActualizado); 
		
	}
	
	@DeleteMapping("eliminarRiesgo/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarRiesgo(@PathVariable Long id){
		Riesgo riesgo = repository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID : " + id));
		
		repository.delete(riesgo);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
	}
}
