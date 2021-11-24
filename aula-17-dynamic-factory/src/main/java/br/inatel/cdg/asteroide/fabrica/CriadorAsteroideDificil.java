package br.inatel.cdg.asteroide.fabrica;

import br.inatel.cdg.asteroide.Asteroide;
import br.inatel.cdg.asteroide.TipoAST;

import java.lang.reflect.InvocationTargetException;

public class CriadorAsteroideDificil extends CriadorAsteroide {
    @Override
    Asteroide criaAsteroide(TipoAST tipo) {
        Class<?> clazz = PropUtils.astClass(tipo);
        Asteroide ast = null;
        try {
            ast = (Asteroide) clazz.getDeclaredConstructor(double.class).newInstance(4);
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
