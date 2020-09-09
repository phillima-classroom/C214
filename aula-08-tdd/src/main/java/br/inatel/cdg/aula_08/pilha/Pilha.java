package br.inatel.cdg.aula_08.pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
	
	private List<Integer> elementos = new ArrayList<Integer>();
	private int qtdElementos;
	private int maxElemento;
	
	public Pilha(int maxElemento) {
		this.maxElemento = maxElemento;
	}
	
	public boolean pilhaVazia() {
		if(qtdElementos == 0)
			return true;
		else
			return false;
	}
	public int getQtdElementos() {
		return this.qtdElementos;
	}
	public void push(int elemento) {
		if(qtdElementos >= maxElemento)
			throw new PilhaCheiaException(elemento);
		elementos.add(elemento);
		qtdElementos++;
	}

	public int mostraTopo() {
		return this.elementos.get(qtdElementos-1);
	}
	public int pop() {
		if(qtdElementos==0)
			throw new PilhaVaziaException();
		int retorno = this.elementos.get(qtdElementos-1);
		this.elementos.remove(qtdElementos-1);
		qtdElementos--;
		return retorno;
	}
}
