package br.inatel.cdg.pato;

import br.inatel.cdg.pato.comportamento.quack.impl.QuackPadrao;
import br.inatel.cdg.pato.comportamento.voar.impl.VoarComAsas;

public class Marreco extends Pato {

	public Marreco() {
		voar = new VoarComAsas();
		quack = new QuackPadrao();
	}
	
	@Override
	public void mostrar() {
		System.out.println("Eu sou um Marreco!");

	}

}
