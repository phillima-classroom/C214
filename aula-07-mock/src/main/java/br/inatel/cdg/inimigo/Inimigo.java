package br.inatel.cdg.inimigo;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.notifier.Notifier;

public class Inimigo {
	
	private String nome;
	private double qtdVida;
	private String arma;
	private List<Notifier> notifiers;
	
	public void tomarDano(double qtdDano) {
		this.qtdVida -= qtdDano;
		if(this.qtdVida <= 0) {
			for (Notifier notifier : notifiers) {
				notifier.notificaMorte(this);
			}
		} 
			
	}
	public void registerNotifier(Notifier notifer) {
		notifiers.add(notifer);
	}
	//Getters, setters e construtor omitidos
	public Inimigo(String nome, double qtdVida, String arma) {
		this.nome = nome;
		this.qtdVida = qtdVida;
		this.arma = arma;
		this.notifiers = new ArrayList<Notifier>();
	}
	
	public String getNome() {
		return nome;
	}
	public double getQtdVida() {
		return qtdVida;
	}
	public String getArma() {
		return arma;
	}
	
	
}
