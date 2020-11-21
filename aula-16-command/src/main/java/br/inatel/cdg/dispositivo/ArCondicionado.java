package br.inatel.cdg.dispositivo;

public class ArCondicionado {
	
	
	public static final int FRIO = 15;
	public static final int BOM = 21;
	public static final int QUENTE = 24;
	public static final int DESLIGADO = 0;
	
	private String local;
	private int temp;
	
	public ArCondicionado () {}
	
	public ArCondicionado(String local) {
		this.local = local;
		temp = 0;
	}
	
	public void frio() {
		temp = FRIO;
	}
	
	public void bom() {
		temp = BOM;
	}
	
	public void quente() {
		temp = QUENTE;
	}
	
	public void desliga() {
		temp = DESLIGADO;
	}
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}

}
