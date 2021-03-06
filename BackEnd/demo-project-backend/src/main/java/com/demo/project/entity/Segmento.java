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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Clase que representa la entidad de la tabla de PRI_MATRIZ_SEGMENTO
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Entity
@Table(name = "PRI_SEGMENTO")
public class Segmento {
	
	@Id
	@Column (name = "ID_SEGMENTO")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_segmento;
	
	@Column(name = "NOMBRE", length = 60, nullable = false)
	private String nombre;
	
	@Column(name = "ESTADO", length = 60)
	private String estado;
	
	@Column(name = "USUARIO_AUDITORIA", length = 60)
	private String usuario_auditoria;
	
	@Column(name = "fecha_auditoria")
	private Date fecha_auditoria;
	
	@OneToMany(mappedBy="id_segmento", fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Segmento> Segmentos;
	
	public Segmento() {
		
	}

	public Segmento(Long id_segmento, String nombre, String estado, String usuario_auditoria, Date fecha_auditoria) {
		super();
		this.id_segmento = id_segmento;
		this.nombre = nombre;
		this.estado = estado;
		this.usuario_auditoria = usuario_auditoria;
		this.fecha_auditoria = fecha_auditoria;
	}

	public Long getId_segmento() {
		return id_segmento;
	}

	public void setId_segmento(Long id_segmento) {
		this.id_segmento = id_segmento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
