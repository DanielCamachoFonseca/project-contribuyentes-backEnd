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

import com.demo.project.entity.Variable;
import com.demo.project.exceptions.ResourceNotFoundExceptions;
import com.demo.project.repository.VariableRepository;

/**
 * Clase que establece todas las rutas de la api y sus funcionalidades 
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class VariableController {
	
	@Autowired
	private VariableRepository repository;
	
	@GetMapping("/consultarVariable")
	public List<Variable> ListarVariable(){
		return repository.findAll();
	}
	
	@PostMapping("registrarVariable")
	public Variable guardarVariable(@RequestBody Variable variable) {
		return repository.save(variable);
	}
	
	@GetMapping("/buscarVariable/{id}")
	public ResponseEntity<Variable> ObtenerVariablePorId(@PathVariable Long id){
		Variable variable = repository.findById(id)
							.orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: " + id));
		return ResponseEntity.ok(variable);
	}
	
	@PutMapping("/actualizarVariable/{id}")
	public ResponseEntity<Variable> actualizarVariable(@PathVariable Long id, @RequestBody Variable detallesVariable){
		Variable variable = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
		variable.setNombre(detallesVariable.getNombre());
		variable.setFuente_sistema(detallesVariable.getFuente_sistema());
		variable.setFuente_informacion(detallesVariable.getFuente_informacion());
		variable.setFormula(detallesVariable.getFormula());
		variable.setPeriodicidad(detallesVariable.getPeriodicidad());
		variable.setProcedimiento_base_datos(detallesVariable.getProcedimiento_base_datos());
		variable.setEstado(detallesVariable.getEstado());
		variable.setUsuario_auditoria(detallesVariable.getUsuario_auditoria());
		variable.setFecha_auditoria(detallesVariable.getFecha_auditoria());
		
		Variable variableActualizado = repository.save(variable);
		return ResponseEntity.ok(variableActualizado);
	}
	
	@DeleteMapping("eliminarVariable/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarVariable(@PathVariable Long id){
		Variable variable = repository.findById(id)
							.orElseThrow(() -> new  ResourceNotFoundExceptions("No existe el registro con el ID:"+ id));
		repository.delete(variable);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
	}	
	

}
