package br.inatel.cdg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.inatel.cdg.cafeteria.bebidas.Bebida;
import br.inatel.cdg.cafeteria.bebidas.Espresso;
import br.inatel.cdg.cafeteria.condimentos.Canela;
import br.inatel.cdg.cafeteria.condimentos.Pacoca;

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
	
	
}
