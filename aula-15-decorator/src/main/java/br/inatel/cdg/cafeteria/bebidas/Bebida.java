package br.inatel.cdg.cafeteria.bebidas;

public abstract class Bebida {

	String descricao = "Bebida Desconhecida";
	
	public String getDescricao() {
		return descricao;
	}
	
	public abstract double preco();
	
}
