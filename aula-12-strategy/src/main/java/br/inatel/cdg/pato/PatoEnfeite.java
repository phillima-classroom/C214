package br.inatel.cdg.pato;

import br.inatel.cdg.pato.comportamento.impl.Mudo;
import br.inatel.cdg.pato.comportamento.impl.NaoPodeVoar;

public class PatoEnfeite extends Pato {

	public PatoEnfeite() {
		voar = new NaoPodeVoar();
		quack = new Mudo();
	}
	
	@Override
	public void mostrar() {
		System.out.println("Sou apenas de enfeite!");
	}

}
