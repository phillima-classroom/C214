package br.inatel.cdg.dispositivo;

public class AparelhoDeSom {

	private int volume;
	private String musica;
	
	public void ligar() {
		System.out.println("Ligando o Som!");
	}
	
	public void desligar() {
		System.out.println("Desligando o Som");
	}
	
	public void colocarMusica(String musica) {
		this.musica = musica;
	}
	
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public String getMusica() {
		return musica;
	}
}
