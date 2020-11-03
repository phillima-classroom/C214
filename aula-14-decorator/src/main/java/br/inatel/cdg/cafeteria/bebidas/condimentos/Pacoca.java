package br.inatel.cdg.cafeteria.bebidas.condimentos;

import br.inatel.cdg.cafeteria.bebidas.Bebida;

public class Pacoca extends CondimentoDecorator {
	
	Bebida bebida;
	
	public Pacoca(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", Mocha";
	}
	
	@Override
	public double preco() {
		return bebida.preco() + 1.00;
	}

}
