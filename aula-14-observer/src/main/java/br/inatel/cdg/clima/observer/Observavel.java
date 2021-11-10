package br.inatel.cdg.clima.observer;

public interface Observavel {

	public void registraObservador(Observer obs);
	public void removeObservador(Observer obs);
	public void notificaObservadores();
	
}