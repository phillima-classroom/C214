package br.inatel.cdg.cafeteria.bebidas.condimentos;

import br.inatel.cdg.cafeteria.bebidas.Bebida;

public class Canela extends CondimentoDecorator {
	
	Bebida bebida;
	
	public Canela(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Canela";
	}

	@Override
	public double preco() {
		return bebida.preco() + 1.2;
	}
	
}
