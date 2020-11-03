package br.inatel.cdg.cafeteria.bebidas.condimentos;

import br.inatel.cdg.cafeteria.bebidas.Bebida;

public class Chantilly extends CondimentoDecorator{

	Bebida bebida;
	
	public Chantilly(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Chantilly";
	}

	@Override
	public double preco() {
		return bebida.preco() + 1.35;
	}

	
}