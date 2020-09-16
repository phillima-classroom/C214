package br.inatel.cdg.aula_08.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteCalculadora {

  	private Calculadora calc;
 	@Before
 	public void setUp() {
 		calc = new Calculadora();
 	}

  	@Test
 	public void testeSoma() {
 		int res = calc.soma(2,3);
 		assertEquals(5, res);
 	}

  	@Test
 	public void testeSubtrair() {
 		int res = calc.subtrair(5,4);
 		assertEquals(1, res);
 	}

  	@Test
 	public void testeMultiplicar() {
 		int res = calc.multiplicacao(6,7);
 		assertEquals(42, res);
 	}

  	@Test
 	public void testDivisao() {
 		double res = calc.divisao(30,4);
 		assertEquals(7.5, res,0.01);
 	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivisaoZero() {
		double res = calc.divisao(30,0);
	}
}
