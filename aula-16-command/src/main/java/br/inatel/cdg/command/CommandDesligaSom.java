package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.AparelhoDeSom;

public class CommandDesligaSom implements ICommand {

	AparelhoDeSom aparelho;
	
	public CommandDesligaSom(AparelhoDeSom aparelho) {
		this.aparelho = aparelho;
	}
	
	@Override
	public void executa() {
		aparelho.setVolume(0);
		aparelho.desligar();
	}

	@Override
	public void desfazer() {
		aparelho.ligar();
		aparelho.setVolume(5);
		aparelho.colocarMusica("Tempelhof");
	}

}
