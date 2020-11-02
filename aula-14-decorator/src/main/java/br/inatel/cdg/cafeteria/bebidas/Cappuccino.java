package br.inatel.cdg.cafeteria.bebidas;

public class Cappuccino extends Bebida {

	public Cappuccino() {
		descricao = "Java Honey";
	}
	
	@Override
	public double preco() {
		return 5.99;
	}

}