package br.inatel.cdg.inimigo;

import br.inatel.cdg.notifier.Notifier;

public class UINotifierMock implements Notifier {

	private boolean executed = false;
	
	@Override
	public void notificaMorte(Inimigo inimigo) {
		
		executed = true;
		
	}
	
	public boolean getExecuted() {
		return executed;
	}
}
