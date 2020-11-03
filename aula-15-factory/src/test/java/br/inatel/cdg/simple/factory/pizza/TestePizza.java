package br.inatel.cdg.simple.factory.pizza;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestePizza {

	@Test
	public void testePizzaCalabresa() {
		
		Pizzaria pizzaria = new Pizzaria(new SimplePizzaFactory());
		Pizza pizza = pizzaria.encomendarPizza("Calabresa");
		
		assertTrue(pizza instanceof PizzaCalabresa);
	
	}

}