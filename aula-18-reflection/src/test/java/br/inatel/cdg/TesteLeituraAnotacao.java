package br.inatel.cdg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Test;

import br.inatel.cdg.leitoranotacao.LeitorAnotacoes;
import br.inatel.cdg.pojo.BoardGame;
import br.inatel.cdg.pojo.Puzzle;

public class TesteLeituraAnotacao {

	@Test
	public void testeExecutaMetodoAnotadoBG() {
		
		LeitorAnotacoes leitorAnot = 
				new LeitorAnotacoes(BoardGame.class);
		leitorAnot.lerAnotacao();
		List<String> nomes = leitorAnot.getNomes();
		assertEquals(2, nomes.size());
		
		assertTrue(nomes.contains("nome"));
		assertTrue(nomes.contains("numJogadores"));
	}
	
	@Test
	public void testeExecutaMetodoAnotadoPuzzle() {
		
		LeitorAnotacoes leitorAnot = 
				new LeitorAnotacoes(Puzzle.class);
		leitorAnot.lerAnotacao();
		List<String> nomes = leitorAnot.getNomes();
		assertEquals(1, nomes.size());
		
		assertTrue(nomes.contains("qtdPecas"));
	}
	
}