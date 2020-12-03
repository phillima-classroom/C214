package br.inatel.cdg.leitoranotacao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.inatel.cdg.annotations.BuscaNome;
import br.inatel.cdg.pojo.BoardGame;

public class LeitorAnotacoes {

	Class<?> clazz;
	List<String> nomes;
	
	public LeitorAnotacoes(Class<?> clazz) {
		this.nomes = new ArrayList<String>();
		this.clazz = clazz;
	}

	public void lerAnotacao() {
		
		for (Field field : clazz.getDeclaredFields()) {
			if(field.isAnnotationPresent(BuscaNome.class)) {
				try {
					nomes.add(field.getName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	public List<String> getNomes() {
		return nomes;
	}

}
