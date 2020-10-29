package br.inatel.cdg.display;

import br.inatel.cdg.clima.observer.Observer;
import br.inatel.cdg.clima.observer.Observavel;

public class CondicoesCorrentes implements Display, Observer {

	private double temperatura,umidade,pressao;
	private Observavel climaDados;
	
	public CondicoesCorrentes(Observavel climaDados) {
		this.climaDados = climaDados;
		climaDados.registraObservador(this);
	}
	
	@Override
	public void display() {
		
		System.out.println("Condições Climáticas: "); 
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Umidade: " + umidade);
		System.out.println("Pressao: " + pressao);
	}

	@Override
	public void update(double temperatura, double umidade, double pressao) {
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
		display();
	}
	
}