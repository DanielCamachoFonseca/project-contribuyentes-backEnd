/**
 * 
 */
package com.demo.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Clase que maneja excepciones o errores del software
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public ResourceNotFoundExceptions(String mensaje) {

		super(mensaje);

	}

}
