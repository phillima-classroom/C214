package br.inatel.cdg.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.inatel.cdg.VarredorMapa;
import br.inatel.cdg.Resultado;

public class VarredorMapaTest {

	@Test
	public void testVarreAsync() {
		
		VarredorMapa f = new VarredorMapa();
		Resultado res = new Resultado();
		
		f.varreAsync(res);
		try {
			Thread.sleep(66);//Esse valor precisa ser calibrado
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertTrue(res.getResultado());
		
	}
	
	@Test
	public void testVarreSync() {
		
		VarredorMapa f = new VarredorMapa();
		boolean retorno = f.varreSync();
		assertTrue(retorno);
		
	}
	
	
	
	
}
