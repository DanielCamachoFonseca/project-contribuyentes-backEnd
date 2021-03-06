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
 * Clase que representa la entidad de la tabla de VIS_PERFIL
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Entity
@Table(name = "VIS_PERFIL")
public class Perfil {
	
	@Id
	@Column (name = "ID_PERFIL")
	@GeneratedValue (strategy = GenerationType .IDENTITY)
	private Long id_perfil;
	
	@Column (name = "NIT")
	private String nit;
	
	@Column (name = "PERIODO")
	private Long periodo;
	
	@Column (name = "ID_MATRIZ_RIESGO")
	private Long matriz_riesgo_id;
	
	@Column (name = "NOMBRE_MATRIZ")
	private String nombre_matriz;
	
	@Column (name = "ID_SEGMENTO")
	private Long segmento_id;
	
	@Column (name = "NOMBRE_SEGMENTO")
	private String nombre_segmento;
	
	@Column(name = "FECHA_DESDE")
	private Date fecha_desde;
	
	@Column(name = "PESO")
	private Long peso;
	
	@Column(name = "VALOR_PERFIL")
	private Double valor_perfil;
	
	@Column(name = "VALOR_EJE_X")
	private Double valor_eje_x;
	
	@Column(name = "VALOR_EJE_Y")
	private Double valor_eje_y;
	
	@Column(name = "VALOR_INCUMPLIMIENTO")
	private Long valor_incumplimiento;
	
	@Column(name = "VALOR_LOG")
	private Double valor_log;
	
	@Column(name = "NUMERO_CUADRANTE")
	private Long numero_cuadrante;
	
	@Column(name = "USUARIO_AUDITORIA")
	private String usuario_auditoria;
	
	@Column(name = "FECHA_AUDITORIA")
	private Date fecha_auditoria;
	
	public Perfil() {
		
	}

	public Perfil(Long id_perfil, String nit, Long periodo, Long matriz_riesgo_id, String nombre_matriz,
			Long segmento_id, String nombre_segmento, Date fecha_desde, Long peso, Double valor_perfil,
			Double valor_eje_x, Double valor_eje_y, Long valor_incumplimiento, Double valor_log, Long numero_cuadrante,
			String usuario_auditoria, Date fecha_auditoria) {
		super();
		this.id_perfil = id_perfil;
		this.nit = nit;
		this.periodo = periodo;
		this.matriz_riesgo_id = matriz_riesgo_id;
		this.nombre_matriz = nombre_matriz;
		this.segmento_id = segmento_id;
		this.nombre_segmento = nombre_segmento;
		this.fecha_desde = fecha_desde;
		this.peso = peso;
		this.valor_perfil = valor_perfil;
		this.valor_eje_x = valor_eje_x;
		this.valor_eje_y = valor_eje_y;
		this.valor_incumplimiento = valor_incumplimiento;
		this.valor_log = valor_log;
		this.numero_cuadrante = numero_cuadrante;
		this.usuario_auditoria = usuario_auditoria;
		this.fecha_auditoria = fecha_auditoria;
	}

	public Long getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(Long id_perfil) {
		this.id_perfil = id_perfil;
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

	public Long getMatriz_riesgo_id() {
		return matriz_riesgo_id;
	}

	public void setMatriz_riesgo_id(Long matriz_riesgo_id) {
		this.matriz_riesgo_id = matriz_riesgo_id;
	}

	public String getNombre_matriz() {
		return nombre_matriz;
	}

	public void setNombre_matriz(String nombre_matriz) {
		this.nombre_matriz = nombre_matriz;
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

	public Date getFecha_desde() {
		return fecha_desde;
	}

	public void setFecha_desde(Date fecha_desde) {
		this.fecha_desde = fecha_desde;
	}

	public Long getPeso() {
		return peso;
	}

	public void setPeso(Long peso) {
		this.peso = peso;
	}

	public Double getValor_perfil() {
		return valor_perfil;
	}

	public void setValor_perfil(Double valor_perfil) {
		this.valor_perfil = valor_perfil;
	}

	public Double getValor_eje_x() {
		return valor_eje_x;
	}

	public void setValor_eje_x(Double valor_eje_x) {
		this.valor_eje_x = valor_eje_x;
	}

	public Double getValor_eje_y() {
		return valor_eje_y;
	}

	public void setValor_eje_y(Double valor_eje_y) {
		this.valor_eje_y = valor_eje_y;
	}

	public Long getValor_incumplimiento() {
		return valor_incumplimiento;
	}

	public void setValor_incumplimiento(Long valor_incumplimiento) {
		this.valor_incumplimiento = valor_incumplimiento;
	}

	public Double getValor_log() {
		return valor_log;
	}

	public void setValor_log(Double valor_log) {
		this.valor_log = valor_log;
	}

	public Long getNumero_cuadrante() {
		return numero_cuadrante;
	}

	public void setNumero_cuadrante(Long numero_cuadrante) {
		this.numero_cuadrante = numero_cuadrante;
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
