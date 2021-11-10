package br.inatel.cdg.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		int c = in.read();
		if(c == -1)
			return c;
		else
			return Character.toLowerCase(c);
		
	}

}