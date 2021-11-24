package br.inatel.cdg.asteroide.fabrica;

import br.inatel.cdg.asteroide.Asteroide;
import br.inatel.cdg.asteroide.AsteroideFogo;
import br.inatel.cdg.asteroide.AsteroidePadrao;
import br.inatel.cdg.asteroide.TipoAST;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteAsteroideFabrica {

    @Test
    public void testAsteroideFogoCriador1() {

        CriadorAsteroide criador1 = new CriadorAsteroideFacil();

        Asteroide astFogo = criador1.buscaAsteroide(TipoAST.AST_FOGO);
        double velocidade = astFogo.getVelocidade();
        double peso = astFogo.getPeso();

        assertEquals(21, velocidade,0.01);
        assertEquals(21, peso,0.01);

    }

    @Test
    public void testAsteroideFogoCriador2() {

        CriadorAsteroide criador2 = new CriadorAsteroideDificil();

        Asteroide astFogo = criador2.buscaAsteroide(TipoAST.AST_FOGO);
        double velocidade = astFogo.getVelocidade();
        double peso = astFogo.getPeso();

        assertEquals(28, velocidade,0.01);
        assertEquals(28, peso,0.01);

    }

    @Test
    public void testAsteroideCaosCriador2() {

        CriadorAsteroide criador2 = new CriadorAsteroideDificil();

        Asteroide astCaos = criador2.buscaAsteroide(TipoAST.AST_CAOS);

        double velocidade = astCaos.getVelocidade();
        double peso = astCaos.getPeso();

        assertEquals(40, velocidade,0.01);
        assertEquals(40, peso,0.01);

    }

}
