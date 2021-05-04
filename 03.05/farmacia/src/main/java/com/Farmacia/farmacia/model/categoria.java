package com.Farmacia.farmacia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_categoria")
public class categoria {

	categoria() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String tipo;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "descricao")
	private List<produto> produto_categoria = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<produto> getProduto_categoria() {
		return produto_categoria;
	}

	public void setProduto_categoria(List<produto> produto_categoria) {
		this.produto_categoria = produto_categoria;
	}
}
