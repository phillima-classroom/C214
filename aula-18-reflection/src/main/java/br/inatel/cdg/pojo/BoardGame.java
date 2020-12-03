package br.inatel.cdg.pojo;

import br.inatel.cdg.annotations.BuscaNome;

public class BoardGame {
	
	@BuscaNome
	private String nome;
	@BuscaNome
	private int numJogadores;
	private boolean cooperativo;
	private String descricao;
	
	public BoardGame () {}
	
	public BoardGame(String nome, int numJogadores, boolean cooperativo, String descricao) {
		this.nome = nome;
		this.numJogadores = numJogadores;
		this.cooperativo = cooperativo;
		this.descricao = descricao;
	}
	
	//Getter and Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumJogadores() {
		return numJogadores;
	}
	public void setNumJogadores(int numJogadores) {
		this.numJogadores = numJogadores;
	}
	public boolean getCooperativo() {
		return cooperativo;
	}
	public void setCooperativo(boolean cooperativo) {
		this.cooperativo = cooperativo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
}