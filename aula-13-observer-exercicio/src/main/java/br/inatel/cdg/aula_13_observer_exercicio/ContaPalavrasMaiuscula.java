package br.inatel.cdg.aula_13_observer_exercicio;

public class ContaPalavrasMaiuscula implements ObservadorPalavra {

	private int numPalavras;
	
	@Override
	public void atualiza(String palavra) {
		if(Character.isUpperCase(palavra.charAt(0)))
			numPalavras++;
	}

	@Override
	public int getNumPalavras() {
		return numPalavras;
	}

}
