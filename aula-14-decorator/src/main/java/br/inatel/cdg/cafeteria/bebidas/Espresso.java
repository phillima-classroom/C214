package br.inatel.cdg.cafeteria.bebidas;

public class Espresso extends Bebida {

	public Espresso() {
		descricao = "Espresso";
	}
	
	@Override
	public double preco() {
		return 3.00;
	}

}
