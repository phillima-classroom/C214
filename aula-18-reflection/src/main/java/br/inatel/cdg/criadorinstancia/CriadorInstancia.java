package br.inatel.cdg.criadorinstancia;

import java.lang.reflect.Constructor;

public class CriadorInstancia {

	public static Object criaEstatico(Class<?> clazz) {
		
		Object objeto = null;
		try {
			objeto = clazz.newInstance();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return objeto;
	}

	public static Object criaEstatico(Class<?> clazz, 
			Object[] parametros) {
		
		Object objecto = null;
		Class<?>[] parameTypes = new Class[parametros.length];
		
		for(int i = 0; i < parametros.length; i++) {
			parameTypes[i] = getTipo(parametros[i]);
		}
		
		try {
			Constructor<?> construtor = 
					clazz.getConstructor(parameTypes);
			objecto = construtor.newInstance(parametros);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return objecto;
	}

	//Metodo interno para resolver as tretas de tipo primitivo
	private static Class<?> getTipo(Object parametros) {
		
		if(parametros.getClass() == Integer.class)
			return int.class;
		else if(parametros.getClass() == Boolean.class)
			return boolean.class;
		return parametros.getClass();
		
	}

}