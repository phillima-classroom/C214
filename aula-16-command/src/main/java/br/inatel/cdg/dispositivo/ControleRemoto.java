package br.inatel.cdg.dispositivo;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.command.ICommand;
import br.inatel.cdg.command.CommandNull;

public class ControleRemoto {
	
	private List<ICommand> onCommands;
	private List<ICommand> offCommands;
	private List<ICommand> desfazerCommands;
	
	ICommand slot;
	
	public ControleRemoto(int qtdBotoesAcao) {
		onCommands = new ArrayList<ICommand>();
		offCommands = new ArrayList<ICommand>();
		desfazerCommands = new ArrayList<ICommand>();
		
		ICommand nullCommand = new CommandNull();
		desfazerCommands.add(nullCommand);
		for(int i = 0;i < qtdBotoesAcao; i++) {
			onCommands.add(nullCommand);
			offCommands.add(nullCommand);
		}
	}

	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
		
		onCommands.add(slot,onCommand);
		offCommands.add(slot,offCommand);
	
	}
	
	public void botaoLigar(int slot) {
		onCommands.get(slot).executa();
		desfazerCommands.add(onCommands.get(slot));
	}
	
	public void botaoDesligar(int slot) {
		offCommands.get(slot).executa();
		desfazerCommands.add(offCommands.get(slot));
	}
	
	public void desfazer() {
		desfazerCommands.get(desfazerCommands.size()-1).desfazer();
		if(desfazerCommands.size() > 1)
			desfazerCommands.remove(desfazerCommands.size()-1);
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("\n------Controle Remoto------\n");

		for (int i = 0; i < onCommands.size(); i++) {
			builder.append("[slot " + i + "] " + onCommands.get(i).getClass().getSimpleName() + 
					"    " + offCommands.get(i).getClass().getSimpleName() +  "\n");
		}
		
		return builder.toString();
	}
	
}