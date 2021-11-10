package br.inatel.cdg.clima.observer;

public interface Observer {

	public void update(double temperatura, double umidade, double pressao);
	
}