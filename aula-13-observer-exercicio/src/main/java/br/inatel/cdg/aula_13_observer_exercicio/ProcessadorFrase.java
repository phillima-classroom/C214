package br.inatel.cdg.aula_13_observer_exercicio;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorFrase {

	private List<ObservadorPalavra> observadores;
	
	public ProcessadorFrase() {
		observadores = new ArrayList<ObservadorPalavra>();
	}
	
	public void processarFrase(String frase) {
		
		String[] palavras = frase.split(" ");
		for (String palavra : palavras) {
			for (ObservadorPalavra observador : observadores) {
				observador.atualiza(palavra);
			}
		}
	
	}

	public void registraObservador(ObservadorPalavra obs) {
		observadores.add(obs);
	}

	public void removeObservador(ObservadorPalavra obs) {
		observadores.remove(obs);
		
	}

	public List<ObservadorPalavra> getObservadores() {
		return observadores;
	}
	
}