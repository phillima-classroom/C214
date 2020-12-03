package br.inatel.cdg.pojo;

import br.inatel.cdg.annotations.BuscaNome;

public class Puzzle {

	private String nome;
	@BuscaNome
	private int qtdPecas;
	private String descricao;
	
	public Puzzle() {}
	
	public Puzzle(String nome, int qtdPecas, String descricao) {
		this.nome = nome;
		this.qtdPecas = qtdPecas;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdPecas() {
		return qtdPecas;
	}
	public void setQtdPecas(int qtdPecas) {
		this.qtdPecas = qtdPecas;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}