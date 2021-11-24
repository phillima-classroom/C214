package br.inatel.cdg.asteroide.fabrica;

import br.inatel.cdg.asteroide.Asteroide;
import br.inatel.cdg.asteroide.TipoAST;

public abstract class CriadorAsteroide {

    protected double dificuldade;

    public final Asteroide buscaAsteroide(TipoAST tipo) {
        Asteroide asteroide = null;

        asteroide = criaAsteroide(tipo);
        asteroide.inicializa();
        asteroide.posiciona();
        return asteroide;
    }

    abstract Asteroide criaAsteroide(TipoAST tipo);

}