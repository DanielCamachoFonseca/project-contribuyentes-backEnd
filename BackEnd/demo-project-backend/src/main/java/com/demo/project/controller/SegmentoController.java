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

import com.demo.project.entity.Segmento;
import com.demo.project.exceptions.ResourceNotFoundExceptions;
import com.demo.project.repository.SegmentoRepository;

/**
 * Clase que establece todas las rutas de la api y sus funcionalidades 
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class SegmentoController {
	
	@Autowired
	private SegmentoRepository repository;
	
	
	/**
	 * Este metodo sirve para consultar los registros de la tabla PRI_SEGMENTO
	 * @return
	 */
	@GetMapping("/consultarSegmento")
	public List<Segmento> ListarSegmento(){
		return repository.findAll();
	}
	
	/**
	 * Este metodo sirve para guardar un nuevo registro en la tabla PRI_SEGMENTO	
	 * @param segmento
	 * @return
	 */
	@PostMapping("registrarSegmento")
	public Segmento guardarSegmento(@RequestBody Segmento segmento) {
		return repository.save(segmento);
	}
	
	/**
	 * Este metodo sirve para buscar un registro de la tabla PRI_SEGMENTO por id	
	 * @param id
	 * @return
	 */
	@GetMapping("/buscarSegmento/{id}")
	public ResponseEntity<Segmento> ObtenerSegmentoPorId(@PathVariable Long id){
		Segmento segmento = repository.findById(id)
							.orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: " + id));
		return ResponseEntity.ok(segmento);
	}
	
	/**
	 * Este metodo sirve para realizar el update de un registro
	 * @param id
	 * @param detallesSegmento
	 * @return
	 */
	@PutMapping("/actualizarSegmento/{id}")
	public ResponseEntity<Segmento> actualizarSegmento(@PathVariable Long id, @RequestBody Segmento detallesSegmento){
		Segmento segmento = repository.findById(id)
							.orElseThrow(() -> new ResourceNotFoundExceptions("No existe el registro con el ID: "+ id));
		segmento.setNombre(detallesSegmento.getNombre());
		segmento.setEstado(detallesSegmento.getEstado());
		segmento.setUsuario_auditoria(detallesSegmento.getUsuario_auditoria());
		segmento.setFecha_auditoria(detallesSegmento.getFecha_auditoria());
		
		Segmento segmentoActualizado = repository.save(segmento);
		return ResponseEntity.ok(segmentoActualizado);
	}
	
	/**
	 * Este metodo sirve para eliminar un registro por id
	 * @param id
	 * @return
	 */
	@DeleteMapping("eliminarSegmento/{id}")
	public ResponseEntity<Map<String,Boolean>> eliminarSegmento(@PathVariable Long id){
		Segmento segmento = repository.findById(id)
							.orElseThrow(() -> new  ResourceNotFoundExceptions("No existe el registro con el ID:"+ id));
		
		repository.delete(segmento);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar",Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
		
		
	}
	
	
	
	

}
