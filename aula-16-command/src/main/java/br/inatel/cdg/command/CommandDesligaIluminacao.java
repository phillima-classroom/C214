package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.Iluminacao;

public class CommandDesligaIluminacao implements ICommand {

	Iluminacao iluminacao;
	
	public CommandDesligaIluminacao(Iluminacao iluminacao) {

		this.iluminacao = iluminacao;
	}
	
	@Override
	public void executa() {
		iluminacao.desliga();
	}

	@Override
	public void desfazer() {
		iluminacao.liga();
		
	}

}
