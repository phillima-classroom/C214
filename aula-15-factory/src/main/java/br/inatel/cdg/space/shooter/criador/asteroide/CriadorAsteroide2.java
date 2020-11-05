package br.inatel.cdg.space.shooter.criador.asteroide;

import br.inatel.cdg.space.shooter.asteroide.Asteroide;
import br.inatel.cdg.space.shooter.asteroide.AsteroideCaos;
import br.inatel.cdg.space.shooter.asteroide.AsteroideEletrico;
import br.inatel.cdg.space.shooter.asteroide.AsteroideFogo;
import br.inatel.cdg.space.shooter.asteroide.AsteroideGelo;
import br.inatel.cdg.space.shooter.asteroide.TipoAsteroide;

public class CriadorAsteroide2 extends CriadorAsteroide {

	public CriadorAsteroide2() {
		this.dificuldade = 4;
	}

	@Override
	public Asteroide criaAsteroide(TipoAsteroide tipo) {
		
		if(tipo == TipoAsteroide.ASTEROIDE_FOGO)
			return new AsteroideFogo(dificuldade);
		else if(tipo == TipoAsteroide.ASTEROIDE_ELETRICO)
			return new AsteroideEletrico(dificuldade);
		else if(tipo == TipoAsteroide.ASTEROIDE_GELO)
			return new AsteroideGelo(dificuldade);
		else if (tipo == TipoAsteroide.ASTEROIDE_CAOS)
			return new AsteroideCaos(dificuldade);
		else
			return null;
	}

}