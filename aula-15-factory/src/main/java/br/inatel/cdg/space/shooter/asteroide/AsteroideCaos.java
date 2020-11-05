package br.inatel.cdg.space.shooter.asteroide;

public class AsteroideCaos extends Asteroide {

	public AsteroideCaos(double dificuldade) {
		this.nome = "Asteroide do Caos";
		this.tipoDanoColisao = "Caótico";
		this.peso = dificuldade*10;
		this.velocidade = dificuldade*10;
		this.vida = dificuldade*10;
	}

}
