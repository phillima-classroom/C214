package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.AparelhoDeSom;

public class CommandLigaSom implements ICommand {

	AparelhoDeSom aparelho;
	
	public CommandLigaSom(AparelhoDeSom aparelho) {
		this.aparelho = aparelho;
	}
	
	@Override
	public void executa() {
		
		aparelho.ligar();
		aparelho.setVolume(5);
		aparelho.colocarMusica("Tempelhof");
	}

	@Override
	public void desfazer() {
		aparelho.setVolume(0);
		aparelho.desligar();
		
	}
}