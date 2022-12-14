package com.bsoftgroup.springcloudmsconsulta.core.negocio.bean;

import java.util.List;

public class Producto {
	private Integer codigo;
	private String descripcion;
	private Integer precio;
	List<Servicio> servicios;

	public Producto() {
	}

	public Producto(Integer codigo, String descripcion, Integer precio, List<Servicio> servicios) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.servicios = servicios;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
}
