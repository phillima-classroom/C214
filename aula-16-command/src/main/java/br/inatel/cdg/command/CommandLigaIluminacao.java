package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.Iluminacao;

public class CommandLigaIluminacao implements ICommand {

	Iluminacao iluminacao;
	
	public CommandLigaIluminacao(Iluminacao light) {
		this.iluminacao = light;
	}
	
	@Override
	public void executa() {
		iluminacao.liga();
	}

	@Override
	public void desfazer() {
		iluminacao.desliga();
	}

}