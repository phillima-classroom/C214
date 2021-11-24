package br.inatel.cdg.space.shooter.criador.asteroide;

import br.inatel.cdg.space.shooter.asteroide.Asteroide;
import br.inatel.cdg.space.shooter.asteroide.TipoAsteroide;

public abstract class CriadorAsteroide {
	
	protected double dificuldade;
	
	public final Asteroide buscaAsteroide(TipoAsteroide tipo) {
		Asteroide asteroide = null;
		
		asteroide = criaAsteroide(tipo);
		asteroide.inicializa();
		asteroide.posiciona();
		return asteroide;
	}
	
	abstract Asteroide criaAsteroide(TipoAsteroide tipo);

}