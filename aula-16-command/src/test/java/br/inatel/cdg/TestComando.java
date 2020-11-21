package br.inatel.cdg;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import br.inatel.cdg.command.CommandAbrePortaoGaragem;
import br.inatel.cdg.command.CommandArCondBom;
import br.inatel.cdg.command.CommandArCondDesliga;
import br.inatel.cdg.command.CommandArCondFrio;
import br.inatel.cdg.command.CommandDesligaIluminacao;
import br.inatel.cdg.command.CommandDesligaSom;
import br.inatel.cdg.command.CommandFechaPortaoGaragem;
import br.inatel.cdg.command.CommandLigaIluminacao;
import br.inatel.cdg.command.CommandLigaSom;
import br.inatel.cdg.command.ICommand;
import br.inatel.cdg.command.MacroCommand;
import br.inatel.cdg.dispositivo.AparelhoDeSom;
import br.inatel.cdg.dispositivo.ArCondicionado;
import br.inatel.cdg.dispositivo.ControleRemoto;
import br.inatel.cdg.dispositivo.Iluminacao;
import br.inatel.cdg.dispositivo.PortaoGaragem;

@RunWith(MockitoJUnitRunner.class)
public class TestComando {

	
	private ControleRemoto controle;
	private InOrder inOrder;
	
	@Mock
	private Iluminacao iluminacaoCozinha, iluminacaoSala;
	
	@Mock
	private PortaoGaragem portaoGaragem;
	
	@Mock
	private AparelhoDeSom aparelhoSom;
	
	@Spy
	private ArCondicionado arCondicionado;
	
	@Before
	public void init() {
		inOrder = Mockito.inOrder(iluminacaoCozinha, portaoGaragem,iluminacaoSala, arCondicionado, aparelhoSom);
		controle = new ControleRemoto(7);
	}
	
	@Test
	public void testLigaLuzCozinha() {
		controle.setCommand(0, new CommandLigaIluminacao(iluminacaoCozinha), new CommandDesligaIluminacao(iluminacaoCozinha));
		controle.botaoLigar(0);
	}
	
	@Test
	public void testLigaApagaLuzCozinha() {
		controle.setCommand(0, new CommandLigaIluminacao(iluminacaoCozinha), new CommandDesligaIluminacao(iluminacaoCozinha));
		controle.botaoLigar(0);
		controle.botaoDesligar(0);
		inOrder.verify(iluminacaoCozinha).liga();
		inOrder.verify(iluminacaoCozinha).desliga();
	}
	
	@Test
	public void testAbreFechaGaragemDesfazer() {
		controle.setCommand(0, new CommandAbrePortaoGaragem(portaoGaragem), new CommandFechaPortaoGaragem(portaoGaragem));
		controle.botaoLigar(0);
		controle.desfazer();
		inOrder.verify(portaoGaragem).abrePortao();
		inOrder.verify(portaoGaragem).fechando();
	}
	
	@Test
	public void testLuzArCondicionado() {
		
		controle.setCommand(0, new CommandLigaIluminacao(iluminacaoSala), new CommandDesligaIluminacao(iluminacaoSala));
		controle.setCommand(1, new CommandArCondBom(arCondicionado), new CommandArCondDesliga(arCondicionado));
		controle.setCommand(2, new CommandArCondFrio(arCondicionado), new CommandArCondDesliga(arCondicionado));
		controle.botaoLigar(0);
		controle.botaoLigar(1);
		controle.botaoLigar(2);
		controle.desfazer();
		controle.desfazer();
		controle.desfazer();
		
		inOrder.verify(iluminacaoSala).liga();
		inOrder.verify(arCondicionado).bom();
		inOrder.verify(arCondicionado).frio();
		inOrder.verify(arCondicionado).bom();
		inOrder.verify(arCondicionado).desliga();
		inOrder.verify(iluminacaoSala).desliga();
	}
	
	@Test
	public void testMacroCommand() {
		List<ICommand> onCommands = new ArrayList<ICommand>();
		List<ICommand> offCommands = new ArrayList<ICommand>();
	
		onCommands.add(new CommandLigaIluminacao(iluminacaoSala));
		onCommands.add(new CommandArCondBom(arCondicionado));
		onCommands.add(new CommandLigaSom(aparelhoSom));
		
		offCommands.add(new CommandDesligaIluminacao(iluminacaoSala));
		offCommands.add(new CommandArCondDesliga(arCondicionado));
		offCommands.add(new CommandDesligaSom(aparelhoSom));
		
		MacroCommand macroCommandOn = new MacroCommand(onCommands);
		MacroCommand macroCommandOff = new MacroCommand(offCommands);
		controle.setCommand(0, macroCommandOn, macroCommandOff);
		controle.botaoLigar(0);
		controle.botaoDesligar(0);
		
		inOrder.verify(iluminacaoSala).liga();
		inOrder.verify(arCondicionado).bom();
		inOrder.verify(aparelhoSom).ligar();
		inOrder.verify(iluminacaoSala).desliga();
		inOrder.verify(arCondicionado).desliga();
		inOrder.verify(aparelhoSom).desligar();
		
	}
	
	@Test
	public void testMacroCommandDesfazer() {
		List<ICommand> onCommands = new ArrayList<ICommand>();
		List<ICommand> offCommands = new ArrayList<ICommand>();
	
		onCommands.add(new CommandLigaIluminacao(iluminacaoSala));
		onCommands.add(new CommandArCondBom(arCondicionado));
		onCommands.add(new CommandLigaSom(aparelhoSom));
		
		offCommands.add(new CommandDesligaIluminacao(iluminacaoSala));
		offCommands.add(new CommandArCondDesliga(arCondicionado));
		offCommands.add(new CommandDesligaSom(aparelhoSom));
		
		MacroCommand macroCommandOn = new MacroCommand(onCommands);
		MacroCommand macroCommandOff = new MacroCommand(offCommands);
		controle.setCommand(0, macroCommandOn, macroCommandOff);
		controle.botaoLigar(0);
		controle.desfazer();
		
		inOrder.verify(iluminacaoSala).liga();
		inOrder.verify(arCondicionado).bom();
		inOrder.verify(aparelhoSom).ligar();
		inOrder.verify(aparelhoSom).desligar();
		inOrder.verify(arCondicionado).desliga();
		inOrder.verify(iluminacaoSala).desliga();
		
	}
	
}
