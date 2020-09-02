package br.inatel.cdg.inimigo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.notifier.Notifier;

public class TesteInimigo {
	
	private Inimigo inimigo;
	
	@Before
	public void setUp() {
		inimigo = new Inimigo("Black Knight", 150, "Black Knight Axe");
	}
	
	@Test
	public void testeChamaNotifier() {
		
		UINotifierMock notifier = new UINotifierMock();
		inimigo.registerNotifier(notifier);
		inimigo.tomarDano(200); //Tomou 200 de dano
		assertTrue(notifier.getExecuted());
		
	}
	@Test
	public void testeNãoChamaNotifier() {
		
		UINotifierMock notifier = new UINotifierMock();
		inimigo.registerNotifier(notifier);
		inimigo.tomarDano(100); //Tomou 100 de dano. Nao deve morrer
		assertFalse(notifier.getExecuted());
		
	}
	
	@Test
	public void testeInimigoMortoDuasNotificacoes() {
		GameManagerNotifierMock gameNotiferMock = new GameManagerNotifierMock();
		UINotifierMock uiNotifierMock = new UINotifierMock();
		inimigo.registerNotifier(gameNotiferMock);
		inimigo.registerNotifier(uiNotifierMock);
		inimigo.tomarDano(150);
		assertTrue(gameNotiferMock.getExecuted());
		assertTrue(uiNotifierMock.getExecuted());
	}
	
	@Test
	public void testeInimigoDanoSemMorte() {
		GameManagerNotifierMock gameNotiferMock = new GameManagerNotifierMock();
		UINotifierMock uiNotifierMock = new UINotifierMock();
		inimigo.registerNotifier(gameNotiferMock);
		inimigo.registerNotifier(uiNotifierMock);
		inimigo.tomarDano(80);
		assertFalse(gameNotiferMock.getExecuted());
		assertFalse(uiNotifierMock.getExecuted());
	}
	
	@Test
	public void testeInimigoDanoUmaNotificacao() {
		GameManagerNotifierMock gameNotiferMock = new GameManagerNotifierMock();
		UINotifierMock uiNotifierMock = new UINotifierMock();
		inimigo.registerNotifier(gameNotiferMock);
		inimigo.tomarDano(200);
		assertTrue(gameNotiferMock.getExecuted());
		assertFalse(uiNotifierMock.getExecuted());
	}
	
}
