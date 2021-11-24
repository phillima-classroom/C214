package br.inatel.cdg;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import br.inatel.cdg.geradorpropriedade.GeradorMapa;
import br.inatel.cdg.pojo.BoardGame;
import br.inatel.cdg.pojo.Puzzle;

public class TesteGeradorPropriedade {

	@Test
	public void testePropBoardGame() {
		
		BoardGame bg = new BoardGame
				("Sagrada", 6, false, "Jogo para preencher vitrais");
		
		Map<String, Object> props = GeradorMapa.gerarMapa(bg);
		
		assertEquals(4, props.size());
		assertEquals("Sagrada", props.get("nome"));
		assertEquals(6, props.get("numJogadores"));
		assertEquals(false, props.get("cooperativo"));
		assertEquals("Jogo para preencher vitrais", 
				props.get("descricao"));
		
	}
	
	@Test
	public void testePropPuzzle() {
		
		Puzzle puzzle = new Puzzle
				("Jardim Vitoriano", 5000, "Puzzle bonito!");
		
		Map<String, Object> props = GeradorMapa.gerarMapa(puzzle);
		
		assertEquals(3, props.size());
		assertEquals("Jardim Vitoriano", props.get("nome"));
		assertEquals(5000, props.get("qtdPecas"));
		assertEquals("Puzzle bonito!", 
				props.get("descricao"));
		
	}
	
}