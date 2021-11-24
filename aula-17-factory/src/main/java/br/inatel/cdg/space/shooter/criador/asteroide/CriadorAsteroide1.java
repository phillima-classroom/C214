package br.inatel.cdg.space.shooter.criador.asteroide;

import br.inatel.cdg.space.shooter.asteroide.Asteroide;
import br.inatel.cdg.space.shooter.asteroide.AsteroideEletrico;
import br.inatel.cdg.space.shooter.asteroide.AsteroideFogo;
import br.inatel.cdg.space.shooter.asteroide.AsteroideGelo;
import br.inatel.cdg.space.shooter.asteroide.AsteroidePadrao;
import br.inatel.cdg.space.shooter.asteroide.TipoAsteroide;

public class CriadorAsteroide1 extends CriadorAsteroide {

	public CriadorAsteroide1() {
		this.dificuldade = 3;
	}

	@Override
	public Asteroide criaAsteroide(TipoAsteroide tipo) {
		
		if(tipo == TipoAsteroide.ASTEROIDE_FOGO)
			return new AsteroideFogo(dificuldade);
		else if(tipo == TipoAsteroide.ASTEROIDE_ELETRICO)
			return new AsteroideEletrico(dificuldade);
		else if(tipo == TipoAsteroide.ASTEROIDE_GELO)
			return new AsteroideGelo(dificuldade);
		else 
			return new AsteroidePadrao(dificuldade);
	}

}