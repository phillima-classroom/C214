package br.inatel.cdg.cafeteria.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.inatel.cdg.cafeteria.bebidas.Bebida;
import br.inatel.cdg.cafeteria.bebidas.Cappuccino;
import br.inatel.cdg.cafeteria.bebidas.Espresso;
import br.inatel.cdg.cafeteria.bebidas.condimentos.Canela;
import br.inatel.cdg.cafeteria.bebidas.condimentos.Chantilly;
import br.inatel.cdg.cafeteria.bebidas.condimentos.Pacoca;

public class TesteBebidas {

	@Test
	public void testeEspressoSimples() {
		
		Bebida espresso = new Espresso();
		double preco = espresso.preco();
		
		assertEquals(3.00, preco,0.01);
		
	}
	
	@Test
	public void testeEspressoComCanela() {
		
		Bebida espresso = new Espresso();
		
		espresso = new Canela(espresso);
		
		double preco = espresso.preco();
		
		assertEquals(4.2, preco,0.01);
		
	}
	
	@Test
	public void testeEspressoComCanelaPacoca() {
		
		Bebida espresso = new Espresso();
		
		espresso = new Canela(espresso);
		espresso = new Pacoca(espresso);
		
		double preco = espresso.preco();
		
		assertEquals(5.2, preco,0.01);
		
	}
	
	@Test
	public void testeEspressoComCanelaDescricao() {
		
		Bebida espresso = new Espresso();
		
		espresso = new Canela(espresso);
		
		String descricao  = espresso.getDescricao();
		
		assertEquals("Espresso, Canela", descricao);
	
	}
	
	@Test
	public void testeCappuccinoComCanelaPacocaChantilly() {
		
		Bebida cappuccino = new Cappuccino();
		cappuccino = new Canela(cappuccino);
		cappuccino = new Pacoca(cappuccino);
		cappuccino = new Chantilly(cappuccino);
		double preco = cappuccino.preco();
		assertEquals(9.55, preco,0.01);
		
	}
	
	
}