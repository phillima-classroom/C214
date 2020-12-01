package br.inatel.cdg.geradorpropriedade;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class GeradorMapa {

	public static Map<String, Object> gerarMapa(Object o){
		Map<String,Object> mapa = new HashMap<String, Object>();
		
		//Busca a instancia que representa a classe da instancia "o"
		Class<?> clazz = o.getClass();
		
		//Percorre todos os metodos que a classe possui
		for (Method method : clazz.getMethods()) {
			if(isGetter(method)) {//verifica se eh um getter
				
				//Busca o nome do membro da classe, baseado 
				//no nome do metodo getter
				String memberName = getMemberNome(method.getName());
				try {
					//Invoca o metodo getter para salvar o valor
					//do membro que esta na instancia "o"
					Object valor = method.invoke(o);
					
					//Armazena no mapa
					mapa.put(memberName, valor);
				} catch (Exception e) {
					e.getStackTrace();
				}
			}
		}
		
		return mapa;
	}
	
	//Metodo para verificar se um metodo eh um getter
	private static boolean isGetter(Method method) {
		//verficia se comeca com a palavra "get"
		return method.getName().startsWith("get") &&
		method.getReturnType() != void.class && //nao pode ser void
		method.getParameterAnnotations().length == 0 && //nao pode ter parametros
		!method.getName().equals("getClass"); //desconsidera o metodo "getClass"
	}
	
	//Metodo que recupera o nome do membro pelo metodo getter
	private static String getMemberNome(String getterName) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(getterName.substring(3, 4).toLowerCase());
		builder.append(getterName.substring(4));
		
		return builder.toString();
	}
	
	
}