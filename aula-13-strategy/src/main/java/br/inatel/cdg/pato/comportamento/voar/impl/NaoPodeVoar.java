package br.inatel.cdg.pato.comportamento.voar.impl;

import br.inatel.cdg.pato.comportamento.Voar;

public class NaoPodeVoar implements Voar {

	@Override
	public void voar() {
		System.out.println("Eu não posso voar!");
	}
	
}