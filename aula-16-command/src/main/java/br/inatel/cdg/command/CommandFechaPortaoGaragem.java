package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.PortaoGaragem;

public class CommandFechaPortaoGaragem implements ICommand {

PortaoGaragem garage;
	
	public CommandFechaPortaoGaragem(PortaoGaragem garage) {
		this.garage = garage;
	}
	
	@Override
	public void executa() {

		garage.fechando();
		
	}

	@Override
	public void desfazer() {
		garage.abrePortao();
		
	}
}
