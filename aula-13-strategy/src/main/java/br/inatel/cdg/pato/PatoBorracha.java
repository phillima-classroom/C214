package br.inatel.cdg.pato;

import br.inatel.cdg.pato.comportamento.quack.impl.Squeak;
import br.inatel.cdg.pato.comportamento.voar.impl.NaoPodeVoar;

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