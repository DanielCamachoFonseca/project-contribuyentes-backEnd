/**
 * 
 */
package com.demo.project.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	private Long id_matriz_riesgo;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "fecha_desde", nullable = false)
	private Date fecha_desde;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "fecha_hasta")
	private Date fecha_hasta;

	@Column(name = "estado", length = 60)
	private String estado;

	@Column(name = "usuario_auditoria", length = 6)
	private String usuario_auditoria;

	@Column(name = "fecha_auditoria")
	private Date fecha_auditoria;
	
	@OneToMany(mappedBy="id_matriz_riesgo", fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<RiesgoCuadrante> RiesgoCuadrantes;
	
	@OneToMany(mappedBy="id_matriz_riesgo", fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<RiesgoVariable> RiesgoVariables;
		
	
	public Riesgo() {

	}
	

	public Riesgo(Long id_matriz_riesgo, String nombre, Date fecha_desde, Date fecha_hasta, String estado, String usuario_auditoria,
			Date fecha_auditoria) {
		super();
		this.id_matriz_riesgo = id_matriz_riesgo;
		this.nombre = nombre;
		this.fecha_desde = fecha_desde;
		this.fecha_hasta = fecha_hasta;
		this.estado = estado;
		this.usuario_auditoria = usuario_auditoria;
		this.fecha_auditoria = fecha_auditoria;
	}

	public Long getId_matriz_riesgo() {
		return id_matriz_riesgo;
	}

	public void setId_matriz_riesgo(Long id_matriz_riesgo) {
		this.id_matriz_riesgo = id_matriz_riesgo;
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
