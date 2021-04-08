package br.com.farmacia.domain;

public class Produtos {
private Long codigo;
private String descricao;
private Double preco;
private int quantidade;
private Fornecedores fornecedores = new Fornecedores();;
public Double getPreco() {
	return preco;
}
public void setPreco(Double preco) {
	this.preco = preco;
}

public Fornecedores getFornecedores() {
	return fornecedores;
}
public void setFornecedores(Fornecedores fornecedores) {
	this.fornecedores = fornecedores;
}
public Long getCodigo() {
	return codigo;
}
public void setCodigo(Long codigo) {
	this.codigo = codigo;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
	
}

}
