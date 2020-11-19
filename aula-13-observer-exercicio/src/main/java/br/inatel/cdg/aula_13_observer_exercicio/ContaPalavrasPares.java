package br.inatel.cdg.aula_13_observer_exercicio;

public class ContaPalavrasPares implements ObservadorPalavra {

	private int numPalavras;
	
	@Override
	public void atualiza(String palavra) {
		if((palavra.length())%2 == 0)
			numPalavras++;
			
	}

	@Override
	public int getNumPalavras() {
		return numPalavras;
	}

}
