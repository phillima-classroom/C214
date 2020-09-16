package br.inatel.cdg.aula_08.camelcase;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TesteCamelCase {

	//@Test
	public void testeNomeSimples() {
		String palavra = "piano";
		
		List<String> resultado = 
				CamelCase.converterCamelCase(palavra);
		assertEquals(palavra, resultado.get(0));
		
	}
	
	//@Test
	public void testeNomeMaiusculo() {
		String palavra = "Piano";
		
		List<String> resultado = 
				CamelCase.converterCamelCase(palavra);
		assertEquals(palavra.toLowerCase(), resultado.get(0));
	}
	
	//@Test
	public void testeNomeComposto() {
		String palavra = "pianoDeCauda";
		
		List<String> resultado = 
				CamelCase.converterCamelCase(palavra);
		assertEquals(3, resultado.size());
		assertEquals("piano", resultado.get(0));
		assertEquals("de", resultado.get(1));
		assertEquals("cauda", resultado.get(2));
	}
	
	//@Test
	public void testeNomeCompostoComecandoMaiusculo() {
		String palavra = "PianoDeCauda";
		
		List<String> resultado = 
				CamelCase.converterCamelCase(palavra);
		assertEquals(3, resultado.size());
		assertEquals("piano", resultado.get(0));
		assertEquals("de", resultado.get(1));
		assertEquals("cauda", resultado.get(2));
	}
	
	//@Test
	public void testeSigla() {
		String palavra = "INATEL";
		
		List<String> resultado = 
				CamelCase.converterCamelCase(palavra);
		assertEquals(1, resultado.size());
		assertEquals("INATEL", resultado.get(0));
	}
	
}
