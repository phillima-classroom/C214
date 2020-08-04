package br.inatel.cdg;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T>{
	private List<T> elementos = new ArrayList<T>();
	private int tamanho = 0;
	
	public int size() {
	   return tamanho;
	}
	
	public boolean pilhaVazia() {
	   return (tamanho == 0);
	}
	
	public void push(T elem) {
	  elementos.add(elem);
	  tamanho++;
	}
	
	public T pop() throws EmptyStackException {
	  if (pilhaVazia())
		  throw new EmptyStackException();
	  T elem = elementos.remove(tamanho-1);
	  tamanho--;
	  return elem;
	}
}
