package br.inatel.cdg.pato;

import br.inatel.cdg.pato.comportamento.impl.NaoPodeVoar;
import br.inatel.cdg.pato.comportamento.impl.QuackPadrao;
import br.inatel.cdg.pato.comportamento.impl.Squeak;

public class PatoBorracha extends Pato {

	public PatoBorracha() {
		voar = new NaoPodeVoar();
		quack = new Squeak();
	}
	
	@Override
	public void mostrar() {
		System.out.println("Sou patinho de borracha!");
	}

}