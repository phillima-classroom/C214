package br.inatel.cdg.asteroide.fabrica;

import br.inatel.cdg.asteroide.Asteroide;
import br.inatel.cdg.asteroide.AsteroideFogo;
import br.inatel.cdg.asteroide.AsteroidePadrao;
import br.inatel.cdg.asteroide.TipoAST;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class CriadorAsteroideFacil extends CriadorAsteroide {

    @Override
    public Asteroide criaAsteroide(TipoAST tipo) {

        Class<?> clazz = PropUtils.astClass(tipo);
        Asteroide ast = null;
        try {
            ast = (Asteroide) clazz.getDeclaredConstructor(double.class).newInstance(3);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return ast;
    }

}