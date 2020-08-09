package br.inatel.cdg;

public class Resultado {

	private boolean resultado;

	public boolean getResultado() {
		return resultado;
	}

	public synchronized void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
}
