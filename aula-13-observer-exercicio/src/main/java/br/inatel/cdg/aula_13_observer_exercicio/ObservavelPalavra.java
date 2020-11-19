package br.inatel.cdg.aula_13_observer_exercicio;


public interface ObservavelPalavra {

	public void registraObservador(ObservadorPalavra obs);
	public void removeObservador(ObservadorPalavra obs);
	public void notificaObservadores();
	
}
