package com.educacionit.digitalers.entidades;

import java.time.LocalDateTime;

public class UsuarioBuilder {
	private Integer id;
	private String correo;
	private String clave;
	private boolean activo;
	private LocalDateTime fechaCreacion;
	
	public UsuarioBuilder() {

	}

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + ", activo=" + activo + ", fechaCreacion="
				+ fechaCreacion + "]";
	}
	
	public UsuarioBuilder id(Integer id) {
		this.id = id;
		return this;
	}
	
	public UsuarioBuilder correo(String correo) {
		this.correo= correo;
		return this;
	}
	
	public UsuarioBuilder clave(String clave) {
		this.clave=clave;
		return this;
	}
	
	public UsuarioBuilder activo(Boolean activo) {
		this.activo=activo;
		return this;

	}
	
	public UsuarioBuilder fechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
		return this;
	}
	
	public Usuario build() {
		return new Usuario(null,correo,clave,activo,fechaCreacion);
	}
	
	
}
