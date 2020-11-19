package br.inatel.cdg.aula_13_observer_exercicio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteNotificadorPalavra {

	private String frase = "Bora jogar Dark Souls Agora";
	
	@Test
	public void testTotalPalavras() {
		
		ProcessadorFrase processador = new ProcessadorFrase();
		processador.registraObservador(new ContaTodasAsPalavrasObservador());
		processador.processarFrase(frase);
		assertEquals(5, processador.getObservadores().get(0).getNumPalavras());
	
	}
	
	@Test
	public void testTodasAsFunc() {
		
		ProcessadorFrase processador = new ProcessadorFrase();
		processador.registraObservador(new ContaTodasAsPalavrasObservador());
		processador.registraObservador(new ContaPalavrasMaiuscula());
		processador.registraObservador(new ContaPalavrasPares());
		processador.processarFrase(frase);
		assertEquals(5, processador.getObservadores().get(0).getNumPalavras());
		assertEquals(4, processador.getObservadores().get(1).getNumPalavras());
		assertEquals(2, processador.getObservadores().get(2).getNumPalavras());
		
	}

}
