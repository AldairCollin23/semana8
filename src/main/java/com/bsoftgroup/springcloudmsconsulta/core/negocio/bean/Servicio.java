package com.bsoftgroup.springcloudmsconsulta.core.negocio.bean;

public class Servicio {
	private Integer codigo;
	private String estado;
	private Integer monto;
	private Cliente cliente;
	private Producto producto;

	public Servicio() {
	}

	public Servicio(Integer codigo, String estado, Integer monto, Cliente cliente, Producto producto) {
		this.codigo = codigo;
		this.estado = estado;
		this.monto = monto;
		this.cliente = cliente;
		this.producto = producto;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getMonto() {
		return monto;
	}

	public void setMonto(Integer monto) {
		this.monto = monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
