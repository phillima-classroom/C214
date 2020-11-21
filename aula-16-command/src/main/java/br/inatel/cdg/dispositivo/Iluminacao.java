package br.inatel.cdg.dispositivo;

public class Iluminacao {

	private String local;
	
	public Iluminacao(String local) {
		this.local = local;
	}
	
	public void liga() {
		System.out.println("Luz do local: " + local + " acesa");
	}
	
	public void desliga() {
		System.out.println("Luz do local: " + local + " apagada");
	}
	
	public String getLocal() {
		return local;
	}
	
}