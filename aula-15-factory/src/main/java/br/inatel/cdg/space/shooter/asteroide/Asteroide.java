package br.inatel.cdg.space.shooter.asteroide;

public abstract class Asteroide {
	
	protected String nome;
	protected String tipoDanoColisao;
	protected double peso,velocidade,vida;
	
	public void inicializa() {
		System.out.println("Inicializando Asteroide: " + this.nome);
		System.out.println("Peso: " + this.peso);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Vida: " + this.vida);
		System.out.println("Dano ao colidir: " + this.tipoDanoColisao);
	}
	
	public void posiciona() {
		System.out.println("Posicionando o Asteroide tela");
	}
	
	//Getters
	public double getPeso() {
		return peso;
	}
	public double getVida() {
		return vida;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public String getNome() {
		return nome;
	}
	public String getTipoDanoColisao() {
		return tipoDanoColisao;
	}

	
	
}