package br.inatel.cdg.clima;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.clima.observer.Observer;
import br.inatel.cdg.clima.observer.Observavel;

public class ClimaDados implements Observavel {

	private double temperatura,umidade,pressao;
	private List<Observer> observadores;
	
	public ClimaDados() {
		observadores = new ArrayList<Observer>();
	}
	
	@Override
	public void registraObservador(Observer obs) {
		observadores.add(obs);
		
	}

	@Override
	public void removeObservador(Observer obs) {
		if(observadores.contains(obs))
			observadores.remove(obs);
		
	}

	@Override
	public void notificaObservadores() {
		for (Observer observer : observadores) {
			observer.update(temperatura, umidade, pressao);
		}
	}
	
	//Esse método é chamado sempre que os valores 
	//medidos se modificacam
	public void novasMedidas() {
		notificaObservadores();
	}
	
	public void setMudancas(double temperatura, double pressao, double umidade) {
		this.temperatura = temperatura;
		this.pressao = pressao;
		this.umidade = umidade;
		novasMedidas();
	}
}
