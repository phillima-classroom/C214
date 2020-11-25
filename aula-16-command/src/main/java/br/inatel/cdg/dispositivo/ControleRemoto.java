package br.inatel.cdg.dispositivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.crypto.NullCipher;

import br.inatel.cdg.command.ICommand;
import br.inatel.cdg.command.CommandNull;

public class ControleRemoto {
	
	private List<ICommand> onCommands;
	private List<ICommand> offCommands;
	private Stack<ICommand> desfazerCommands;
	
	public ControleRemoto(int qtdBotoesAcao) {
		onCommands = new ArrayList<ICommand>();
		offCommands = new ArrayList<ICommand>();
		desfazerCommands = new Stack<ICommand>();
		
		ICommand nullCommand = new CommandNull();
		desfazerCommands.push(nullCommand);
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
		desfazerCommands.push(onCommands.get(slot));
	}
	
	public void botaoDesligar(int slot) {
		offCommands.get(slot).executa();
		desfazerCommands.push(offCommands.get(slot));
	}
	
	public void desfazer() {
		
		desfazerCommands.pop().desfazer();
		if(desfazerCommands.size() == 0)
			desfazerCommands.push(new CommandNull());
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