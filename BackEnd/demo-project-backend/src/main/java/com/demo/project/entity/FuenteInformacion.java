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
 * Clase que representa la entidad de la tabla de VIS_FUENTES_INFORMACION
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Entity
@Table(name = "VIS_FUENTES_INFORMACION")
public class FuenteInformacion {
	
	@Id
	@Column (name = "ID_FUENTE_INFORMACION")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_fuente_informacion;
	
	@Column(name = "NIT")
	private String nit;
	
	@Column(name = "PERIODO")
	private Long periodo;
	
	@Column(name = "ID_VARIABLE")
	private Long variable_id;
	
	@Column(name = "NOMBRE_VARIABLE")
	private String nombre_variable;
	
	@Column(name = "ID_SEGMENTO")
	private Long segmento_id;
	
	@Column(name = "NOMBRE_SEGMENTO")
	private String nombre_segmento;
	
	@Column(name = "VALOR_VARIABLE")
	private Long valor_variable;
	
	@Column(name = "USUARIO_AUDITORIA")
	private String usuario_auditoria;
	
	@Column(name = "FECHA_AUDITORIA")
	private Date fecha_auditoria;
	
	public FuenteInformacion() {
		
	}

	public FuenteInformacion(Long id_fuente_informacion, String nit, Long periodo, Long variable_id,
			String nombre_variable, Long segmento_id, String nombre_segmento, Long valor_variable,
			String usuario_auditoria, Date fecha_auditoria) {
		super();
		this.id_fuente_informacion = id_fuente_informacion;
		this.nit = nit;
		this.periodo = periodo;
		this.variable_id = variable_id;
		this.nombre_variable = nombre_variable;
		this.segmento_id = segmento_id;
		this.nombre_segmento = nombre_segmento;
		this.valor_variable = valor_variable;
		this.usuario_auditoria = usuario_auditoria;
		this.fecha_auditoria = fecha_auditoria;
	}

	public Long getId_fuente_informacion() {
		return id_fuente_informacion;
	}

	public void setId_fuente_informacion(Long id_fuente_informacion) {
		this.id_fuente_informacion = id_fuente_informacion;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public Long getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Long periodo) {
		this.periodo = periodo;
	}

	public Long getVariable_id() {
		return variable_id;
	}

	public void setVariable_id(Long variable_id) {
		this.variable_id = variable_id;
	}

	public String getNombre_variable() {
		return nombre_variable;
	}

	public void setNombre_variable(String nombre_variable) {
		this.nombre_variable = nombre_variable;
	}

	public Long getSegmento_id() {
		return segmento_id;
	}

	public void setSegmento_id(Long segmento_id) {
		this.segmento_id = segmento_id;
	}

	public String getNombre_segmento() {
		return nombre_segmento;
	}

	public void setNombre_segmento(String nombre_segmento) {
		this.nombre_segmento = nombre_segmento;
	}

	public Long getValor_variable() {
		return valor_variable;
	}

	public void setValor_variable(Long valor_variable) {
		this.valor_variable = valor_variable;
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
