package br.inatel.cdg.aula_08.compras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoCompra {

	@Test
	public void testSomaTotalCompra() {

		BoardGame bg1 = new BoardGame("Sagrada", 6, true,150);
		BoardGame bg2 = new BoardGame("Azul", 4, false,100);

		CarrinhoCompra carrinho = new CarrinhoCompra();

		carrinho.adiciona(bg1);
		carrinho.adiciona(bg2);

		assertEquals(250, carrinho.somaTotal(),0.01);

	}

}

