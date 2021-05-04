package com.sustentaCommerce.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_produto")
public class produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private Float preco_unitario;
	
	@NotNull
	private Integer quantidade;
	
	private Integer fk_tb_categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(Float preco_unitario) {
		this.preco_unitario = preco_unitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getFk_tb_categoria() {
		return fk_tb_categoria;
	}

	public void setFk_tb_categoria(Integer fk_tb_categoria) {
		this.fk_tb_categoria = fk_tb_categoria;
	}
	
}