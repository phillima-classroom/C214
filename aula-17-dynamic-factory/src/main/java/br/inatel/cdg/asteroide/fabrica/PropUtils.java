package br.inatel.cdg.asteroide.fabrica;

import br.inatel.cdg.asteroide.TipoAST;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropUtils {

    public static Class<?> astClass(TipoAST tipoAST){
        InputStream is = CriadorAsteroideFacil.class.getResourceAsStream("/asteroide-fabrica.properties");
        Properties prop = new Properties();
        try {
            prop.load(is);
            String className = prop.getProperty(tipoAST.name());
            Class<?> clazz = Class.forName(className);
            return clazz;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}