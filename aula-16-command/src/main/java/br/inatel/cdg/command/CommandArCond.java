package br.inatel.cdg.command;

import br.inatel.cdg.dispositivo.ArCondicionado;

public abstract class CommandArCond implements ICommand {
	
	protected ArCondicionado arCond;
	protected int tempAnterior;
	
	public CommandArCond(ArCondicionado arCond) {
		this.arCond = arCond;
	}
	
	@Override
	public void executa() {
		tempAnterior = arCond.getTemp();
	}
	
	@Override
	public void desfazer() {

		if(tempAnterior==ArCondicionado.BOM)
			arCond.bom();
		else if(tempAnterior==ArCondicionado.FRIO)
			arCond.frio();
		else if(tempAnterior==ArCondicionado.QUENTE)
			arCond.quente();
		else if(tempAnterior==ArCondicionado.DESLIGADO)
			arCond.desliga();
	}

}
