package br.inatel.cdg.aula_08.achievement;

import java.util.ArrayList;
import java.util.List;

public class AchievmentMessages {

	private List<RecebedorMSG> receiver = new ArrayList<RecebedorMSG>();
	
	public void distribuirMensagem(String msg) {
		if(receiver.isEmpty())
			throw new SemRecebedoresException("Sem recebedores valido");
		for (RecebedorMSG recebedorMensagem : receiver) {
			try {
				recebedorMensagem.recebedorMensagem(msg);
			} catch (RuntimeException e) {
				
			}
		}
	}

	public void adicionaRecebedor(RecebedorMSG rm) {
		this.receiver.add(rm);
	}

	public void removerRecebedor(RecebedorMSG rm) {
		receiver.remove(rm);
		
	}

}