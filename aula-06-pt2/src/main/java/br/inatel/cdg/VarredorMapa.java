package br.inatel.cdg;

import java.util.HashMap;

public class VarredorMapa {
	
	public void varreAsync(Resultado res) {
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				boolean ret = varreSync();
				res.setResultado(ret);
			}
			
		}).start();
	}
	
	public boolean varreSync() {
		HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < 1000; i++) {
			mapa.put(i, i);
		}
		
		mapa.forEach((k,v)->{
			mapa.get(k);
		});
		
		return true;
	}
	
}
