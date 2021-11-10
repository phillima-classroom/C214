package br.inatel.cdg.teste.pato;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.inatel.cdg.pato.Marreco;
import br.inatel.cdg.pato.Pato;
import br.inatel.cdg.pato.PatoBorracha;
import br.inatel.cdg.pato.PatoEnfeite;
import br.inatel.cdg.pato.comportamento.quack.impl.Mudo;
import br.inatel.cdg.pato.comportamento.quack.impl.Squeak;
import br.inatel.cdg.pato.comportamento.voar.impl.NaoPodeVoar;
import br.inatel.cdg.pato.comportamento.voar.impl.VoarComAsas;
import br.inatel.cdg.pato.comportamento.voar.impl.VoarFoguete;

public class TestPato {
	
	Pato pato;
	
	@Test
	public void testePatoBorracha() {
		pato = new PatoBorracha();
		assertTrue(pato.getVoar() instanceof NaoPodeVoar);
		assertTrue(pato.getQuack() instanceof Squeak);
	}
	
	@Test
	public void testePatoEnfeite() {
		pato = new PatoEnfeite();
		assertTrue(pato.getVoar() instanceof NaoPodeVoar);
		assertTrue(pato.getQuack() instanceof Mudo);
	}
	
	@Test
	public void testeMarreco() {
		pato = new Marreco();
		assertTrue(pato.getVoar() instanceof VoarComAsas);
		pato.setVoar(new VoarFoguete());
		assertTrue(pato.getVoar() instanceof VoarFoguete);
	}
	
	
	
}
