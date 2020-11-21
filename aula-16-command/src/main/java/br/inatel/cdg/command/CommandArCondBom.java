package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.ArCondicionado;

public class CommandArCondBom extends CommandArCond {

	public CommandArCondBom(ArCondicionado arCond) {
		super(arCond);
	}
	
	@Override
	public void executa() {
		super.executa();
		arCond.bom();
	}

}