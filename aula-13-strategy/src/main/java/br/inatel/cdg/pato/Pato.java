package br.inatel.cdg.pato;

import br.inatel.cdg.pato.comportamento.Quack;
import br.inatel.cdg.pato.comportamento.Voar;

public abstract class Pato {
	
	//Composicao com instancia de Voar
	protected Voar voar;
	
	//Composicao com instancia de Quack
	protected Quack quack;
	
	public abstract void mostrar();
	
	//Comportamento delegado
	public void executarVoo() {
		voar.voar();
	}
	//Comportamento delegado
	public void executarQuack() {
		quack.quack();
	}
	
	public void nadar() {
		System.out.println("Qualquer pato pode nadar. Se está boiando já conta!");
	}
	
	//Getter e Setter
	public void setVoar(Voar voar) {
		this.voar = voar;
	}
	
	public void setQuack(Quack quack) {
		this.quack = quack;
	}
	
	public Quack getQuack() {
		return quack;
	}
	
	public Voar getVoar() {
		return voar;
	}
}