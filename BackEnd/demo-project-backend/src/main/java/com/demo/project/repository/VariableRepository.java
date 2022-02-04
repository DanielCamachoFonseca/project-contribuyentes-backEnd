package com.demo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.project.entity.Variable;

/**
 * Clase donde extiendo los metodos CRUD de Jpa Repository
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */
public interface VariableRepository extends JpaRepository<Variable, Long> {

}
