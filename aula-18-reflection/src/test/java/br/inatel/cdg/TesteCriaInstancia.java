package br.inatel.cdg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.inatel.cdg.criadorinstancia.CriadorInstancia;
import br.inatel.cdg.pojo.BoardGame;
import br.inatel.cdg.pojo.Puzzle;
public class TesteCriaInstancia {

	@Test
	public void testeCriaBGVazio() {
		
		BoardGame bg = (BoardGame) CriadorInstancia.
				criaEstatico(BoardGame.class);
		assertNotNull(bg);
		
	}
	
	@Test
	public void testeCriaBGParametros() {
		
		Object[] parametros = new Object[4];
		parametros[0] = "Azul";
		parametros[1] = 4;
		parametros[2] = true;
		parametros[3] = "Jogo Azul";
				
		
		BoardGame bg = (BoardGame) CriadorInstancia.criaEstatico(
				BoardGame.class,parametros);
		
		assertEquals("Azul", bg.getNome());
		assertEquals(4, bg.getNumJogadores());
		assertEquals(true, bg.getCooperativo());
		assertEquals("Jogo Azul", bg.getDescricao());
		
	}
	
	@Test
	public void testeCriaPuzzleVazio() {
		
		Puzzle puzzle = (Puzzle) CriadorInstancia.criaEstatico(Puzzle.class);
		assertNotNull(puzzle);
		
	}
	
	@Test
	public void testeCriaPuzzleParametros() {
		
		Object[] parametros = new Object[3];
		parametros[0] = "Petit Cafe";
		parametros[1] = 6000;
		parametros[2] = "Puzzle fera!";
		
		Puzzle puzzle = (Puzzle) CriadorInstancia.criaEstatico(Puzzle.class,parametros);
		
		assertEquals(6000, puzzle.getQtdPecas());
		assertEquals("Puzzle fera!", puzzle.getDescricao());
		assertEquals("Petit Cafe", puzzle.getNome());
		
	}
}