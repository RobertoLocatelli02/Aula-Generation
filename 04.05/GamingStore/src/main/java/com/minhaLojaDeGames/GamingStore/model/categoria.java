package com.minhaLojaDeGames.GamingStore.model;

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
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String tipo_categoria;
	
	@NotNull
	private String empresa;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "descricao")
	private List<produto> produto_da_loja;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo_categoria() {
		return tipo_categoria;
	}

	public void setTipo_categoria(String tipo_categoria) {
		this.tipo_categoria = tipo_categoria;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<produto> getProduto_da_loja() {
		return produto_da_loja;
	}

	public void setProduto_da_loja(List<produto> produto_da_loja) {
		this.produto_da_loja = produto_da_loja;
	}
}
