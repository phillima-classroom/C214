package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.ArCondicionado;

public class CommandArCondDesliga extends CommandArCond {

	public CommandArCondDesliga(ArCondicionado arCond) {
		super(arCond);
	}
	
	@Override
	public void executa() {
		super.executa();
		arCond.desliga();
	}

}
