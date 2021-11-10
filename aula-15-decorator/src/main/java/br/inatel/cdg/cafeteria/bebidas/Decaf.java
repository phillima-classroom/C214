package br.inatel.cdg.cafeteria.bebidas;

public class Decaf extends Bebida {
	
	public Decaf() {
		descricao = "Descafeinado";
	}
	
	@Override
	public double preco() {
		return 4.00;
	}

}
