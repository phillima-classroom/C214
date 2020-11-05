package br.inatel.cdg.space.shooter.asteroide;

public class AsteroideGelo extends Asteroide {

	public AsteroideGelo(double dificuldade) {
		this.nome = "Asteroide de Gelo";
		this.tipoDanoColisao = "Gelo";
		this.peso = dificuldade*5;
		this.velocidade = dificuldade*5;
		this.vida = dificuldade*5;
	}
}