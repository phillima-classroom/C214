package br.inatel.cdg.aula_08.compras;

public class BoardGame {
	
	private String nome;
	private int qtdPlayers;
	private double valor;
	private boolean cooperativo;
	
	public BoardGame(String nome, int qtdPlayers,boolean cooperativo,
			double valor) {
		this.nome = nome;
		this.qtdPlayers = qtdPlayers;
		this.valor = valor;
		this.cooperativo = cooperativo;
	}
	
	//Getters omitidos
	public String getNome() {
		return nome;
	}
	public int getQtdPlayers() {
		return qtdPlayers;
	}
	public double getValor() {
		return valor;
	}
	public boolean isCooperativo() {
		return cooperativo;
	}
}