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
 * Clase que representa la entidad de la tabla de PRI_PERFIL_VARIABLE
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Entity
@Table(name = "VIS_PERFIL_VARIABLE")
public class PerfilVariable {
	
	@Id
	@Column (name = "ID_PERFIL_VARIABLE")
	@GeneratedValue (strategy = GenerationType .IDENTITY)
	private Long id_perfil_variable;
	
	@Column (name = "ID_PERFIL")
	private Long perfil_id;
	
	@Column (name = "ID_MATRIZ_RIESGO_VARIABLE")
	private Long matriz_riesgo_variable_id;
	
	@Column (name = "ID_VARIABLE")
	private Long variable_id;
	
	@Column (name = "NOMBRE_VARIABLE")
	private String nombre_variable;
	
	@Column (name = "VALOR_VARIABLE")
	private Long valor_variable;
	
	@Column (name = "VALOR_NORMALIZADO")
	private Long valor_normalizado;
	
	@Column (name = "VALOR_RIESGO")
	private Long valor_riesgo;
	
	@Column(name = "USUARIO_AUDITORIA")
	private String usuario_auditoria;
	
	@Column(name = "FECHA_AUDITORIA")
	private Date fecha_auditoria;
	
	public PerfilVariable() {
		
	}

	public PerfilVariable(Long id_perfil_variable, Long perfil_id, Long matriz_riesgo_variable_id, Long variable_id,
			String nombre_variable, Long valor_variable, Long valor_normalizado, Long valor_riesgo,
			String usuario_auditoria, Date fecha_auditoria) {
		super();
		this.id_perfil_variable = id_perfil_variable;
		this.perfil_id = perfil_id;
		this.matriz_riesgo_variable_id = matriz_riesgo_variable_id;
		this.variable_id = variable_id;
		this.nombre_variable = nombre_variable;
		this.valor_variable = valor_variable;
		this.valor_normalizado = valor_normalizado;
		this.valor_riesgo = valor_riesgo;
		this.usuario_auditoria = usuario_auditoria;
		this.fecha_auditoria = fecha_auditoria;
	}

	public Long getId_perfil_variable() {
		return id_perfil_variable;
	}

	public void setId_perfil_variable(Long id_perfil_variable) {
		this.id_perfil_variable = id_perfil_variable;
	}

	public Long getPerfil_id() {
		return perfil_id;
	}

	public void setPerfil_id(Long perfil_id) {
		this.perfil_id = perfil_id;
	}

	public Long getMatriz_riesgo_variable_id() {
		return matriz_riesgo_variable_id;
	}

	public void setMatriz_riesgo_variable_id(Long matriz_riesgo_variable_id) {
		this.matriz_riesgo_variable_id = matriz_riesgo_variable_id;
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

	public Long getValor_variable() {
		return valor_variable;
	}

	public void setValor_variable(Long valor_variable) {
		this.valor_variable = valor_variable;
	}

	public Long getValor_normalizado() {
		return valor_normalizado;
	}

	public void setValor_normalizado(Long valor_normalizado) {
		this.valor_normalizado = valor_normalizado;
	}

	public Long getValor_riesgo() {
		return valor_riesgo;
	}

	public void setValor_riesgo(Long valor_riesgo) {
		this.valor_riesgo = valor_riesgo;
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
