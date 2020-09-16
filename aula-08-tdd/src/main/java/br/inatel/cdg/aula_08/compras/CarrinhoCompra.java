package br.inatel.cdg.aula_08.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

	private List<BoardGame> jogos;
	
	public CarrinhoCompra() {
		jogos = new ArrayList<BoardGame>();
	}
	
	public void adiciona(BoardGame bg) {
		jogos.add(bg);
	}

	public double somaTotal() {
		double total = 0;
		for (BoardGame boardGame : jogos) {
			total += boardGame.getValor();
		}
		return total;
	}
}