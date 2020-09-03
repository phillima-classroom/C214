package br.inatel.cdg.inimigo.busca.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import br.inatel.cdg.inimigo.BuscaInimigo;
import br.inatel.cdg.inimigo.Inimigo;
import br.inatel.cdg.inimigo.InimigoService;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaInimigo {
	
	@Mock
	private InimigoService service;
	private BuscaInimigo buscaInimigo;
	
	@Before
	public void setup() {
		buscaInimigo = new BuscaInimigo(service);
	}
	
	@Test
	public void testeBuscaInimigoRingedKnight() {
		
		Mockito.when(service.busca(23)).thenReturn(InimigoConst.RINGED_KNIGHT);
		Inimigo ringedKnight = buscaInimigo.buscaInimigo(23);
		assertEquals("Ringed Knight", ringedKnight.getNome());
		assertEquals(200.0, ringedKnight.getQtdVida(),0.1);
		assertEquals("Ringed Knight Sword", ringedKnight.getArma());
	}
	
	@Test
	public void testeBuscaInimigoPadrao() {
		
		Mockito.when(service.busca(-1)).thenReturn(InimigoConst.HOLLOW);
		Inimigo inimigo = buscaInimigo.buscaInimigo(-1);
		assertEquals("Hollow", inimigo.getNome());
		assertEquals(20.0, inimigo.getQtdVida(),0.1);
		assertEquals("Broken Sword", inimigo.getArma());
	}
	
}
class InimigoConst {
	
	public static String RINGED_KNIGHT = 
	          "{ \"nome\": \"Ringed Knight\", \n " + 
    		  "\"vida\": 200, \n " + 
    		  "\"arma\": \"Ringed Knight Sword\" }";  

	public static String HOLLOW =
			"{ \"nome\": \"Hollow\", \n " + 
		    "\"vida\": 20, \n " + 
		    "\"arma\": \"Broken Sword\" }"; 
}
