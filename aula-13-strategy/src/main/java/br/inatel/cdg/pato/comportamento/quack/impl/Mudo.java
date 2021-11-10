package br.inatel.cdg.pato.comportamento.quack.impl;

import br.inatel.cdg.pato.comportamento.Quack;

public class Mudo implements Quack {

	@Override
	public void quack() {
		System.out.println("Sou Mudo!");
	}

}