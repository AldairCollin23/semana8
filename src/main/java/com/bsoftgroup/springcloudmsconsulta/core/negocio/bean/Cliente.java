package com.bsoftgroup.springcloudmsconsulta.core.negocio.bean;

import java.util.List;

public class Cliente {
	private Integer codigo;
	private String nombres;
	private Empresa empresa;
	private List<Servicio>
	servicios;

	public Cliente() {
	}

	public Cliente(Integer codigo, String nombres, Empresa empresa, List<Servicio> servicios) {
		this.codigo = codigo;
		this.nombres = nombres;
		this.empresa = empresa;
		this.servicios = servicios;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
}
