package br.inatel.cdg.command;

import java.util.List;

public class MacroCommand implements ICommand {

	private List<ICommand> comandos;
	
	public MacroCommand(List<ICommand> comandos) {
		this.comandos = comandos;
	}
	
	@Override
	public void executa() {
		for (ICommand comando : comandos) {
			comando.executa();
		}

	}

	@Override
	public void desfazer() {
		for(int i = comandos.size()-1; i >= 0; i--)
			comandos.get(i).desfazer();
	}

}
