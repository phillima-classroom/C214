package br.inatel.cdg.geradorpropriedade;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class GeradorMapa {

	public static Map<String, Object> gerarMapa(Object o){
		Map<String,Object> mapa = new HashMap<String, Object>();
		
		Class<?> clazz = o.getClass();
		
		for (Method method : clazz.getMethods()) {
			if(isGetter(method)) {
				String memberName = getMemberNome(method.getName());
				try {
					Object valor = method.invoke(o);
					mapa.put(memberName, valor);
				} catch (Exception e) {
					e.getStackTrace();
				}
			}
		}
		
		return mapa;
	}
	
	private static boolean isGetter(Method method) {
		return method.getName().startsWith("get") &&
		method.getReturnType() != void.class &&
		method.getParameterAnnotations().length == 0 &&
		!method.getName().equals("getClass");
	}
	
	private static String getMemberNome(String getterName) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(getterName.substring(3, 4).toLowerCase());
		builder.append(getterName.substring(4));
		
		return builder.toString();
	}
	
	
}