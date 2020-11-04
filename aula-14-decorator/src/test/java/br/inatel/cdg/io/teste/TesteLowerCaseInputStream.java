package br.inatel.cdg.io.teste;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.io.LowerCaseInputStream;

public class TesteLowerCaseInputStream {
	
	private String msgExpected = "quero jogar cthulu death may die";
	private String msgOriginal = "Quero jogar Cthulu Death May Die";
	private String nomeArquivo = "teste.txt";
	
	@Before
	public void init() {
		
		try{
			PrintStream pStream = new PrintStream(nomeArquivo);
			pStream.print(msgOriginal);
			pStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testArquivoCreated() {
		long tamanho = 0;
		try {
			tamanho = Files.size(Paths.get(nomeArquivo));
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertEquals(32, tamanho);
	}
	
	@Test
	public void testFraseMinuscula() {
		StringBuilder msgLida = new StringBuilder();
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new FileInputStream(nomeArquivo));
			while((c = in.read()) >= 0) {
				msgLida.append((char)c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertEquals(msgExpected, msgLida.toString());
			
	}

}