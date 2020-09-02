package br.inatel.cdg.inimigo.busca;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.inimigo.BuscaInimigo;
import br.inatel.cdg.inimigo.Inimigo;
import br.inatel.cdg.inimigo.InimigoService;

public class TesteBuscaInimigo {
	
	InimigoService service;
	BuscaInimigo buscaInimigo;
	
	@Before
	public void setup() {
        service = new MockInimigoService();
		buscaInimigo = new BuscaInimigo(service);
	}
	
	@Test
	public void testeBuscaInimigoRingedKnight() {
		
		//O ringed knight possui id 23
		Inimigo ringedKnight = buscaInimigo.buscaInimigo(23); 
		
		assertEquals("Ringed Knight", ringedKnight.getNome());
		assertEquals(200.0, ringedKnight.getQtdVida(),0.1);
		assertEquals("Ringed Knight Sword", ringedKnight.getArma());
		
	}
	
	@Test
	public void testeBuscaInimigoPadrao() {
		
		Inimigo inimigo = buscaInimigo.buscaInimigo(-1);
		
		assertEquals("Hollow", inimigo.getNome());
		assertEquals(20.0, inimigo.getQtdVida(),0.1);
		assertEquals("Broken Sword", inimigo.getArma());
		
	}
}

 