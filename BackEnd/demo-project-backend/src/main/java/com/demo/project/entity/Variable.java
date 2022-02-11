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
 * Clase que representa la entidad de la tabla de PRI_VARIABLE
 * Version 1.0
 * @author Daniel Camacho Fonseca
 *
 */

@Entity
@Table(name = "VIS_VARIABLE")
public class Variable {
	
	@Id 
	@Column(name = "ID_VARIABLE")
	@GeneratedValue (strategy = GenerationType .IDENTITY)
	private Long id_variable;
	
	@Column(name = "NOMBRE", length = 200, nullable = false)
	private String nombre;
	
	
	@Column(name = "FUENTE_SISTEMA", length = 200, nullable = false)
	private String fuente_sistema;
	
	@Column(name = "FUENTE_INFORMACION", length = 200, nullable = false)
	private String fuente_informacion;
	
	@Column(name = "FORMULA", length = 200, nullable = false)
	private String formula;
	
	@Column(name = "PERIODICIDAD", length = 100, nullable = false)
	private String periodicidad;
	
	@Column(name = "PROCEDIMIENTO_BASE_DATOS", length = 60)
	private String procedimiento_base_datos;
	
	@Column(name = "ESTADO", length = 60)
	private String estado;
	
	@Column(name = "USUARIO_AUDITORIA", length = 60)
	private String usuario_auditoria;
	
	@Column(name = "fecha_auditoria")
	private Date fecha_auditoria;
	
	@OneToMany(mappedBy="id_variable", fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Variable> Variables;

	public Variable() {
	
	}
	
	
	public Variable(Long id_variable, String nombre, String fuente_sistema, String fuente_informacion, String formula,
			String periodicidad, String procedimiento_base_datos, String estado, String usuario_auditoria,
			Date fecha_auditoria) {
		super();
		this.id_variable = id_variable;
		this.nombre = nombre;
		this.fuente_sistema = fuente_sistema;
		this.fuente_informacion = fuente_informacion;
		this.formula = formula;
		this.periodicidad = periodicidad;
		this.procedimiento_base_datos = procedimiento_base_datos;
		this.estado = estado;
		this.usuario_auditoria = usuario_auditoria;
		this.fecha_auditoria = fecha_auditoria;
	}



	public Long getId_variable() {
		return id_variable;
	}

	public void setId_variable(Long id_variable) {
		this.id_variable = id_variable;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFuente_sistema() {
		return fuente_sistema;
	}

	public void setFuente_sistema(String fuente_sistema) {
		this.fuente_sistema = fuente_sistema;
	}

	public String getFuente_informacion() {
		return fuente_informacion;
	}

	public void setFuente_informacion(String fuente_informacion) {
		this.fuente_informacion = fuente_informacion;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	public String getProcedimiento_base_datos() {
		return procedimiento_base_datos;
	}

	public void setProcedimiento_base_datos(String procedimiento_base_datos) {
		this.procedimiento_base_datos = procedimiento_base_datos;
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
