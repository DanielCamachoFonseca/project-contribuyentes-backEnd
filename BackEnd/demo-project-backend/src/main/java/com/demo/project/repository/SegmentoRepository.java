/**
 * 
 */
package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.project.entity.Segmento;



/**
 * Clase donde extiendo los metodos CRUD de Jpa Repository
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */
public interface SegmentoRepository extends JpaRepository<Segmento, Long> {

}
