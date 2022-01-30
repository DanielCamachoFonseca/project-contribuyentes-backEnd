/**
 * 
 */
package com.demo.project.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que representa la entidad de la tabla de PRI_MATRIZ_RIESGO
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Entity
@Table(name = "PRI_MATRIZ_RIESGO")
public class Riesgo {

	@Id
	@Column(name = "ID_MATRIZ_RIESGO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@Column(name = "fecha_desde", nullable = false)
	private Date fecha_desde;

	@Column(name = "fecha_hasta", nullable = false)
	private Date fecha_hasta;

	@Column(name = "estado", length = 60, nullable = false)
	private String estado;

	@Column(name = "usuario_auditoria", length = 60, nullable = false)
	private String usuario_auditoria;

	@Column(name = "fecha_auditoria", nullable = false)
	private Date fecha_auditoria;

	public Riesgo() {

	}

	public Riesgo(Long id, String nombre, Date fecha_desde, Date fecha_hasta, String estado, String usuario_auditoria,
			Date fecha_auditoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_desde = fecha_desde;
		this.fecha_hasta = fecha_hasta;
		this.estado = estado;
		this.usuario_auditoria = usuario_auditoria;
		this.fecha_auditoria = fecha_auditoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_desde() {
		return fecha_desde;
	}

	public void setFecha_desde(Date fecha_desde) {
		this.fecha_desde = fecha_desde;
	}

	public Date getFecha_hasta() {
		return fecha_hasta;
	}

	public void setFecha_hasta(Date fecha_hasta) {
		this.fecha_hasta = fecha_hasta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUsuario_auditoria() {
		return usuario_auditoria;
	}

	public void setUsuario_auditoria(String usuario_auditoria) {
		this.usuario_auditoria = usuario_auditoria;
	}

	public Date getFecha_auditoria() {
		return fecha_auditoria;
	}

	public void setFecha_auditoria(Date fecha_auditoria) {
		this.fecha_auditoria = fecha_auditoria;
	}

}