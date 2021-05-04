package com.sustentaCommerce.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_categoria")
public class categorias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String departamento;
	
	@NotNull
	private String tipo_produto;
	
	@NotNull
	private String materia_prima;

/*	private produtos departamento_id;
	
	private produtos tipo_produto_id;
	
	private produtos categoria_id;  */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTipo_produto() {
		return tipo_produto;
	}

	public void setTipo_produto(String tipo_produto) {
		this.tipo_produto = tipo_produto;
	}

	public String getMateria_prima() {
		return materia_prima;
	}

	public void setMateria_prima(String materia_prima) {
		this.materia_prima = materia_prima;
	}

/*	public produtos getDepartamento_id() {
		return departamento_id;
	}

	public void setDepartamento_id(produtos departamento_id) {
		this.departamento_id = departamento_id;
	}

	public produtos getTipo_produto_id() {
		return tipo_produto_id;
	}

	public void setTipo_produto_id(produtos tipo_produto_id) {
		this.tipo_produto_id = tipo_produto_id;
	}

	public produtos getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(produtos categoria_id) {
		this.categoria_id = categoria_id;
	}*/
}