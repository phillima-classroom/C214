package br.inatel.cdg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestaNotificadorPalavra {

	private String frase = "Bora jogar Dark Souls Agora";
	
	
	@Test
	public void testTotalPalavras() {
		
		ProcessadorFrase processador = new ProcessadorFrase();
		processador.registraObservador(new ContaTodasAsPalavras());
		processador.processarFrase(frase);
		assertEquals(5, processador.getObservadores().get(0).getNumPalavras());
	
	}
	
	@Test
	public void testTodasAsFunc() {
		
		ProcessadorFrase processador = new ProcessadorFrase();
		processador.registraObservador(new ContaTodasAsPalavras());
		processador.registraObservador(new ContaPalavrasMaiuscula());
		processador.registraObservador(new ContaPalavrasPares());
		processador.processarFrase(frase);
		assertEquals(5, processador.getObservadores().get(0).getNumPalavras());
		assertEquals(4, processador.getObservadores().get(1).getNumPalavras());
		assertEquals(2, processador.getObservadores().get(2).getNumPalavras());
		
	}
}