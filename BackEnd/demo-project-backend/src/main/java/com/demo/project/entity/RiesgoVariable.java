/**
 * 
 */
package com.demo.project.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Clase que representa la entidad de la tabla de PRI_PERFIL_VARIABLE
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Entity
@Table(name = "PRI_MATRIZ_RIESGO_VARIABLE")
public class RiesgoVariable {
	
	@Id
	@Column (name = "ID_MATRIZ_RIESGO_VARIABLE")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_matriz_riesgo_variable;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn (name = "ID_MATRIZ_RIESGO")
	private Riesgo id_matriz_riesgo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn (name = "ID_VARIABLE", nullable = false)
	private Variable id_variable;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn (name = "ID_SEGMENTO", nullable = false)
	private Segmento id_segmento;
	
	@Column (name = "FUENTE_PESO_Y")
	private Double fuente_peso_y;
	
	@Column (name = "FUENTE_EJE_X")
	private String fuente_eje_x;
	
	@Column (name = "FUENTE_EJE_Y")
	private String fuente_eje_y;
	
	@Column (name = "FUENTE_PESO_CONTRIBUYENTE")
	private String fuente_peso_contribuyente;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "USUARIO_AUDITORIA")
	private String usuario_auditoria;
	
	@Column(name = "FECHA_AUDITORIA")
	private Date fecha_auditoria;	
	
	
	public RiesgoVariable() {
		
	}


	public RiesgoVariable(Long id_matriz_riesgo_variable, Riesgo id_matriz_riesgo, Variable id_variable,
			Segmento id_segmento, Double fuente_peso_y, String fuente_eje_x, String fuente_eje_y,
			String fuente_peso_contribuyente, String estado, String usuario_auditoria, Date fecha_auditoria) {
		super();
		this.id_matriz_riesgo_variable = id_matriz_riesgo_variable;
		this.id_matriz_riesgo = id_matriz_riesgo;
		this.id_variable = id_variable;
		this.id_segmento = id_segmento;
		this.fuente_peso_y = fuente_peso_y;
		this.fuente_eje_x = fuente_eje_x;
		this.fuente_eje_y = fuente_eje_y;
		this.fuente_peso_contribuyente = fuente_peso_contribuyente;
		this.estado = estado;
		this.usuario_auditoria = usuario_auditoria;
		this.fecha_auditoria = fecha_auditoria;
	}


	public Long getId_matriz_riesgo_variable() {
		return id_matriz_riesgo_variable;
	}


	public void setId_matriz_riesgo_variable(Long id_matriz_riesgo_variable) {
		this.id_matriz_riesgo_variable = id_matriz_riesgo_variable;
	}


	public Riesgo getId_matriz_riesgo() {
		return id_matriz_riesgo;
	}


	public void setId_matriz_riesgo(Riesgo id_matriz_riesgo) {
		this.id_matriz_riesgo = id_matriz_riesgo;
	}


	public Variable getId_variable() {
		return id_variable;
	}


	public void setId_variable(Variable id_variable) {
		this.id_variable = id_variable;
	}


	public Segmento getId_segmento() {
		return id_segmento;
	}


	public void setId_segmento(Segmento id_segmento) {
		this.id_segmento = id_segmento;
	}


	public Double getFuente_peso_y() {
		return fuente_peso_y;
	}


	public void setFuente_peso_y(Double fuente_peso_y) {
		this.fuente_peso_y = fuente_peso_y;
	}


	public String getFuente_eje_x() {
		return fuente_eje_x;
	}


	public void setFuente_eje_x(String fuente_eje_x) {
		this.fuente_eje_x = fuente_eje_x;
	}


	public String getFuente_eje_y() {
		return fuente_eje_y;
	}


	public void setFuente_eje_y(String fuente_eje_y) {
		this.fuente_eje_y = fuente_eje_y;
	}


	public String getFuente_peso_contribuyente() {
		return fuente_peso_contribuyente;
	}


	public void setFuente_peso_contribuyente(String fuente_peso_contribuyente) {
		this.fuente_peso_contribuyente = fuente_peso_contribuyente;
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
