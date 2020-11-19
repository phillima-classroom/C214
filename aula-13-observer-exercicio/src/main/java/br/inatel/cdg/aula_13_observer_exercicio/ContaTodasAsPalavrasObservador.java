package br.inatel.cdg.aula_13_observer_exercicio;

public class ContaTodasAsPalavrasObservador implements ObservadorPalavra {

	private int numPalavras;
	
	@Override
	public void atualiza(String palavra) {
		numPalavras++;
	}

	@Override
	public int getNumPalavras() {
		return numPalavras;
	}
	
}