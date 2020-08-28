package br.inatel.cdg.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.inatel.cdg.VarredorMapa;
import br.inatel.cdg.Resultado;

public class VarredorMapaTest {

	//Em um codigo real esse teste nao deveria existir
	//apenas o sincrono. Deixei aqui apenas para fins de demonstracao
	@Test
	public void testVarreAsync() throws InterruptedException {
		
		VarredorMapa f = new VarredorMapa();
		Resultado res = new Resultado();
		
		f.varreAsync(res);
		//Esse valor precisa ser calibrado
		//de forma que você veja o mesmo teste falhando/passando
		Thread.sleep(66);
		
		assertTrue(res.getResultado());
		
	}
	
	@Test
	public void testVarreSync() {
		
		VarredorMapa f = new VarredorMapa();
		boolean retorno = f.varreSync();
		assertTrue(retorno);
		
	}
	
	
	
	
}
