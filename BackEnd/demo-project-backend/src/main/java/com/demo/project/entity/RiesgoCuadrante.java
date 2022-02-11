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
 * Clase que representa la entidad de la tabla de PRI_MATRIZ_RIESGO_CUADRANTE
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Entity
@Table(name = "PRI_MATRIZ_RIESGO_CUADRANTE")
public class RiesgoCuadrante {
	
	@Id
	@Column (name = "ID_MATRIZ_RIESGO_CUADRANTE")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_matriz_riesgo_cuadrante;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn (name = "ID_MATRIZ_RIESGO")
	private Riesgo id_matriz_riesgo;
	
//	@Column (name = "NOMBRE_MATRIZ")
//	private String nombre_matriz;
	
	@Column (name = "NUMERO_CUADRANTE")
	private Long numero_cuadrante;
	
	@Column(name = "VALOR_EJE_X_DESDE")
	private Double valor_eje_x_desde;
	
	@Column(name = "VALOR_EJE_X_HASTA")
	private Double valor_eje_x_hasta;
	
	@Column(name = "VALOR_EJE_Y_DESDE")
	private Double valor_eje_y_desde;
	
	@Column(name = "VALOR_EJE_Y_HASTA")
	private Double valor_eje_y_hasta;
	
	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "USUARIO_AUDITORIA")
	private String usuario_auditoria;
	
	@Column(name = "FECHA_AUDITORIA")
	private Date fecha_auditoria;	
	
	public RiesgoCuadrante() {
		
	}

	public RiesgoCuadrante(Long id_matriz_riesgo_cuadrante, Riesgo id_matriz_riesgo,
			Long numero_cuadrante, Double valor_eje_x_desde, Double valor_eje_x_hasta, Double valor_eje_y_desde,
			Double valor_eje_y_hasta, String color, String estado, String usuario_auditoria, Date fecha_auditoria) {
		super();
		this.id_matriz_riesgo_cuadrante = id_matriz_riesgo_cuadrante;
		this.id_matriz_riesgo = id_matriz_riesgo;
		/* this.nombre_matriz = nombre_matriz; */
		this.numero_cuadrante = numero_cuadrante;
		this.valor_eje_x_desde = valor_eje_x_desde;
		this.valor_eje_x_hasta = valor_eje_x_hasta;
		this.valor_eje_y_desde = valor_eje_y_desde;
		this.valor_eje_y_hasta = valor_eje_y_hasta;
		this.color = color;
		this.estado = estado;
		this.usuario_auditoria = usuario_auditoria;
		this.fecha_auditoria = fecha_auditoria;
	}

	public Long getId_matriz_riesgo_cuadrante() {
		return id_matriz_riesgo_cuadrante;
	}

	public void setId_matriz_riesgo_cuadrante(Long id_matriz_riesgo_cuadrante) {
		this.id_matriz_riesgo_cuadrante = id_matriz_riesgo_cuadrante;
	}

	public Riesgo getId_matriz_riesgo() {
		return id_matriz_riesgo;
	}

	public void setId_matriz_riesgo(Riesgo id_matriz_riesgo) {
		this.id_matriz_riesgo = id_matriz_riesgo;
	}

//	public String getNombre_matriz() {
//		return nombre_matriz;
//	}
//
//	public void setNombre_matriz(String nombre_matriz) {
//		this.nombre_matriz = nombre_matriz;
//	}

	public Long getNumero_cuadrante() {
		return numero_cuadrante;
	}

	public void setNumero_cuadrante(Long numero_cuadrante) {
		this.numero_cuadrante = numero_cuadrante;
	}

	public Double getValor_eje_x_desde() {
		return valor_eje_x_desde;
	}

	public void setValor_eje_x_desde(Double valor_eje_x_desde) {
		this.valor_eje_x_desde = valor_eje_x_desde;
	}

	public Double getValor_eje_x_hasta() {
		return valor_eje_x_hasta;
	}

	public void setValor_eje_x_hasta(Double valor_eje_x_hasta) {
		this.valor_eje_x_hasta = valor_eje_x_hasta;
	}

	public Double getValor_eje_y_desde() {
		return valor_eje_y_desde;
	}

	public void setValor_eje_y_desde(Double valor_eje_y_desde) {
		this.valor_eje_y_desde = valor_eje_y_desde;
	}

	public Double getValor_eje_y_hasta() {
		return valor_eje_y_hasta;
	}

	public void setValor_eje_y_hasta(Double valor_eje_y_hasta) {
		this.valor_eje_y_hasta = valor_eje_y_hasta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
