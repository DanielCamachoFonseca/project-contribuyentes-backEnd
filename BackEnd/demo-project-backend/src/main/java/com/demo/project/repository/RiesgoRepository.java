/**
 * 
 */
package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.entity.Riesgo;

/**
 * Clase donde extiendo los metodos CRUD de Jpa Repository
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Repository
public interface RiesgoRepository extends JpaRepository<Riesgo, Long> {

}
