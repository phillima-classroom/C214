package br.inatel.cdg.cafeteria.bebidas;

public class Cappuccino extends Bebida {

	public Cappuccino() {
		descricao = "Cappuccino";
	}
	
	@Override
	public double preco() {
		return 6.00;
	}

}