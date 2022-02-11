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
import com.demo.project.entity.RiesgoVariable;
import com.demo.project.entity.Segmento;
import com.demo.project.entity.Variable;
import com.demo.project.exceptions.ResourceNotFoundExceptions;
import com.demo.project.repository.RiesgoRepository;
import com.demo.project.repository.RiesgoVariableRepository;
import com.demo.project.repository.SegmentoRepository;
import com.demo.project.repository.VariableRepository;

/**
 * Clase que establece todas las rutas de la api y sus funcionalidades 
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@RestController
@RequestMapping("/RiesgoVariable")
@CrossOrigin(origins = "http://localhost:4200")
public class RiesgoVariableController {
	
	@Autowired
	private RiesgoVariableRepository repository;
	
	@Autowired
	private RiesgoRepository riesgoRepository;
	
	@Autowired
	private VariableRepository variableRepository;
	
	@Autowired
	private SegmentoRepository segmentoRepository;
	
	@GetMapping("/consultarRiesgoVariable")
	public List<RiesgoVariable> ListarRiesgoVariable(){
		return repository.findAll();
	}
	
	@GetMapping("/listRiesgo")
	public List<Riesgo> ListarRiesgo() {
		return riesgoRepository.findAll();
	}
	
	@GetMapping("/listaVariable")
	public List<Variable> ListarVariable(){
		return variableRepository.findAll();
	}
	
	@GetMapping("/listaSegmento")
	public List<Segmento> ListarSegmento(){
		return segmentoRepository.findAll();
	}
	
	@PostMapping("/registrarRiesgoVariable")
	public RiesgoVariable guardarRiesgoVariable(@RequestBody RiesgoVariable riesgoVariable) {
		return repository.save(riesgoVariable);
	}
	
	@GetMapping("/buscarRiesgoVariable/{id}")
	public ResponseEntity<RiesgoVariable> obtenerRiesgoVariablePorId(@PathVariable Long id) {
		RiesgoVariable riesgovariable = repository.findById(id)
	.orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
	return ResponseEntity.ok(riesgovariable);
	}
	
	@PutMapping("/actualizarRiesgoVariable/{id}")
	public ResponseEntity<RiesgoVariable> actualizarRiesgoVariable(@PathVariable Long id, @RequestBody RiesgoVariable detallesRiesgoVariable){
		RiesgoVariable riesgovariable = repository.findById(id)
				  .orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
		riesgovariable.setId_matriz_riesgo(detallesRiesgoVariable.getId_matriz_riesgo());
		riesgovariable.setId_variable(detallesRiesgoVariable.getId_variable());
		riesgovariable.setId_segmento(detallesRiesgoVariable.getId_segmento());
		riesgovariable.setFuente_peso_y(detallesRiesgoVariable.getFuente_peso_y());
		riesgovariable.setFuente_eje_x(detallesRiesgoVariable.getFuente_eje_x());
		riesgovariable.setFuente_eje_y(detallesRiesgoVariable.getFuente_eje_y());
		riesgovariable.setFuente_peso_contribuyente(detallesRiesgoVariable.getFuente_peso_contribuyente());
		
		RiesgoVariable riesgoVariableActualizado = repository.save(riesgovariable);
		return ResponseEntity.ok(riesgoVariableActualizado);
	}
	
	
	@DeleteMapping("eliminarRiesgoVariable/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarRiesgoVariable(@PathVariable Long id){
		RiesgoVariable riesgovariable = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
		
		repository.delete(riesgovariable);
		Map<String, Boolean> respuesta = new HashMap<>();
		return ResponseEntity.ok(respuesta);
	}	

}
