package br.inatel.cdg.command;

public class CommandNull implements ICommand {

	@Override
	public void executa() {
		System.out.println("Null Command!");
	}

	@Override
	public void desfazer() {
		System.out.println("Null Command");
		
	}

}
