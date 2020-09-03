package br.inatel.cdg.inimigo.mockito;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import br.inatel.cdg.inimigo.Inimigo;
import br.inatel.cdg.notifier.Notifier;

@RunWith(MockitoJUnitRunner.class)
public class TesteInimigo {
	
	@Mock
	private Notifier notifier;
	
	@Mock
	private Notifier notifier2;
	
	private Inimigo inimigo;
	
	@Before
	public void setUp() {
		inimigo = new Inimigo("Black Knight", 150, "Black Knight Axe");
	}
	
	@Test
	public void testeChamaNotifier() {
		
		inimigo.registerNotifier(notifier);
		inimigo.tomarDano(200); //Tomou 200 de dano
		Mockito.verify(notifier).notificaMorte(inimigo);
	}
	
	@Test
	public void testeNaoChamaNotifier() {
		
		inimigo.registerNotifier(notifier);
		inimigo.tomarDano(149);
		Mockito.verifyNoInteractions(notifier);
		
	}
	
	@Test
	public void testeDuasNotificacoes() {
		
		inimigo.registerNotifier(notifier);
		inimigo.registerNotifier(notifier2);
		inimigo.tomarDano(150);
		Mockito.verify(notifier).notificaMorte(inimigo);
		Mockito.verify(notifier2).notificaMorte(inimigo);
		
	}
	
	@Test
	public void testeDuasNotificacoesNaoOcorreu() {
		
		inimigo.registerNotifier(notifier);
		inimigo.registerNotifier(notifier2);
		inimigo.tomarDano(100);
		Mockito.verifyNoInteractions(notifier);
		Mockito.verifyNoInteractions(notifier2);
		
	}
	
	@Test
	public void testeDuasNotificacoesNaoOcorreuUma() {
		
		inimigo.registerNotifier(notifier);
		inimigo.tomarDano(150);
		Mockito.verify(notifier).notificaMorte(inimigo);
		Mockito.verifyNoInteractions(notifier2);
		
	}
	

}
