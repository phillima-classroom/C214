package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.PortaoGaragem;

public class CommandAbrePortaoGaragem implements ICommand {

	PortaoGaragem garage;
	
	public CommandAbrePortaoGaragem(PortaoGaragem garage) {
		this.garage = garage;
	}
	
	@Override
	public void executa() {
		garage.abrePortao();
	}

	@Override
	public void desfazer() {
		garage.fechando();
		
	}

}
