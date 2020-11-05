package br.inatel.cdg.space.shooter.asteroide;

public class AsteroideEletrico extends Asteroide {

	public AsteroideEletrico(double dificuldade) {
		this.nome = "Asteroide Eletrico";
		this.tipoDanoColisao = "Elétrico";
		this.peso = dificuldade*8;
		this.velocidade = dificuldade*8;
		this.vida = dificuldade*8;
	}

}