package br.inatel.cdg.space.shooter;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inatel.cdg.space.shooter.asteroide.Asteroide;
import br.inatel.cdg.space.shooter.asteroide.AsteroideFogo;
import br.inatel.cdg.space.shooter.asteroide.TipoAsteroide;
import br.inatel.cdg.space.shooter.criador.asteroide.CriadorAsteroide;
import br.inatel.cdg.space.shooter.criador.asteroide.CriadorAsteroide1;
import br.inatel.cdg.space.shooter.criador.asteroide.CriadorAsteroide2;

public class TesteAsteroide {

	@Test
	public void testAsteroideFogoCriador1() {
		
		CriadorAsteroide criador1 = new CriadorAsteroide1();
		
		Asteroide astFogo = criador1.buscaAsteroide(TipoAsteroide.ASTEROIDE_FOGO);
		double velocidade = astFogo.getVelocidade();
		double peso = astFogo.getPeso();
		
		assertEquals(21, velocidade,0.01);
		assertEquals(21, peso,0.01);
		
	}
	
	@Test
	public void testAsteroideFogoCriador2() {
		
		CriadorAsteroide criador2 = new CriadorAsteroide2();
		
		Asteroide astFogo = criador2.buscaAsteroide(TipoAsteroide.ASTEROIDE_FOGO);
		double velocidade = astFogo.getVelocidade();
		double peso = astFogo.getPeso();
		
		assertEquals(28, velocidade,0.01);
		assertEquals(28, peso,0.01);
		
	}

	@Test
	public void testAsteroideCaosCriador2() {
		
		CriadorAsteroide criador2 = new CriadorAsteroide2();
		
		Asteroide astCaos = criador2.buscaAsteroide(TipoAsteroide.ASTEROIDE_CAOS);
		
		double velocidade = astCaos.getVelocidade();
		double peso = astCaos.getPeso();
		
		assertEquals(40, velocidade,0.01);
		assertEquals(40, peso,0.01);
		
	}
}
