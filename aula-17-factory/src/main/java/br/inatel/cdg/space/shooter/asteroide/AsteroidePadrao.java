package br.inatel.cdg.space.shooter.asteroide;

public class AsteroidePadrao extends Asteroide {

	public AsteroidePadrao(double dificuldade) {
		this.nome = "Asteroide Padrao";
		this.tipoDanoColisao = "Padrao";
		this.peso = dificuldade*4;
		this.velocidade = dificuldade*4;
		this.vida = dificuldade*4;
	}

}
