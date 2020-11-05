package br.inatel.cdg.space.shooter.asteroide;

public class AsteroideFogo extends Asteroide {

	public AsteroideFogo(double dificuldade) {
		this.nome = "Asteroide de Fogo";
		this.tipoDanoColisao = "Fogo";
		this.peso = dificuldade*7;
		this.velocidade = dificuldade*7;
		this.vida = dificuldade*7;
	}

}