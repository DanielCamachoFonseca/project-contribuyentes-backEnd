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
import com.demo.project.entity.RiesgoCuadrante;
import com.demo.project.exceptions.ResourceNotFoundExceptions;
import com.demo.project.repository.RiesgoCuadranteRepository;
import com.demo.project.repository.RiesgoRepository;

/**
 * Clase que establece todas las rutas de la api y sus funcionalidades 
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@RestController
@RequestMapping("/RiesgoCuadrante")
@CrossOrigin(origins = "http://localhost:4200")
public class RiesgoCuadranteController {
	
	@Autowired
	private RiesgoCuadranteRepository repository;
	
	@Autowired
	private RiesgoRepository riesgoRepository;
	
	
	@GetMapping("/consultarRiesgoCuadrante")
	public List<RiesgoCuadrante> ListarFuenteInformacion(){
		return repository.findAll();
	}
			
	/**
	 * Este metodo sirve para listar los registros que estan en la tabla PRI_MATRIZ_RIESGO
	 * @return
	 */
	@GetMapping("/listaRiesgo")
	public List<Riesgo> ListarRiesgo() {
		return riesgoRepository.findAll();
	}
	
	@PostMapping("/registrarRiesgoCuadrante")
	public RiesgoCuadrante guardarRiesgoCuadrante(@RequestBody RiesgoCuadrante riesgoCuadrante) {
		return repository.save(riesgoCuadrante);
	}
	
	/**
	 * Este metodo sirve para buscar un registro por ID
	 * @param id
	 * @return
	 */
	@GetMapping("/buscarRiesgoCuadrante/{id}")
	public ResponseEntity<RiesgoCuadrante> obtenerRiesgoCuadrantePorId(@PathVariable Long id){
		RiesgoCuadrante riesgocuadrante = repository.findById(id)
										  .orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
		return ResponseEntity.ok(riesgocuadrante);
	}
	
	
	/**
	 * Este metodo sirve para actualizar un registro de la entidad riesgo
	 * @param id
	 * @param detallesRiesgo
	 * @return
	 */
	@PutMapping("/actualizarRiesgoCuadrante/{id}")
	public ResponseEntity<RiesgoCuadrante> actualizarRiesgoCuadrante(@PathVariable Long id, @RequestBody RiesgoCuadrante detallesRiesgoCuadrante){
		RiesgoCuadrante riesgocuadrante = repository.findById(id)
				  .orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
		riesgocuadrante.setId_matriz_riesgo(detallesRiesgoCuadrante.getId_matriz_riesgo());
		riesgocuadrante.setNumero_cuadrante(detallesRiesgoCuadrante.getNumero_cuadrante());
		riesgocuadrante.setValor_eje_x_desde(detallesRiesgoCuadrante.getValor_eje_x_desde());
		riesgocuadrante.setValor_eje_x_hasta(detallesRiesgoCuadrante.getValor_eje_x_hasta());
		riesgocuadrante.setValor_eje_y_desde(detallesRiesgoCuadrante.getValor_eje_y_desde());
		riesgocuadrante.setValor_eje_y_hasta(detallesRiesgoCuadrante.getValor_eje_y_hasta());
		riesgocuadrante.setColor(detallesRiesgoCuadrante.getColor());
		
		RiesgoCuadrante riesgoCuadranteActualizado = repository.save(riesgocuadrante);
		return ResponseEntity.ok(riesgoCuadranteActualizado);
		
	}
	
	@DeleteMapping("eliminarRiesgoCuadrante/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarRiesgoCuadrante(@PathVariable Long id){
		RiesgoCuadrante riesgocuadrante = repository.findById(id)
				  .orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
		
		repository.delete(riesgocuadrante);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
	}

}
