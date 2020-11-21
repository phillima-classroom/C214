package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.ArCondicionado;

public class CommandArCondFrio extends CommandArCond {

	public CommandArCondFrio(ArCondicionado arCond) {
		super(arCond);
	}

	@Override
	public void executa() {
		super.executa();
		arCond.frio();
	}

}