/**
 * 
 */
package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.entity.RiesgoCuadrante;

/**
 * Clase donde extiendo los metodos CRUD de Jpa Repository
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Repository
public interface RiesgoCuadranteRepository extends JpaRepository<RiesgoCuadrante, Long> {

}
