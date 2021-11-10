package br.inatel.cdg.pato.comportamento.quack.impl;

import br.inatel.cdg.pato.comportamento.Quack;

public class Squeak implements Quack {

	@Override
	public void quack() {
		System.out.println("Barulho patinho de borracha!");
	}

}
