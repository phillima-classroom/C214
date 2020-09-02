package br.inatel.cdg.inimigo;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo {
	
	InimigoService inimigoService;
	
	public BuscaInimigo(InimigoService service) {
		this.inimigoService = service;
	}
	
	public Inimigo buscaInimigo(int id) {
		String iniJson = inimigoService.busca(id);
		JsonObject jsonObject = JsonParser.parseString(iniJson).getAsJsonObject();

		return new Inimigo(jsonObject.get("nome").getAsString(), 
						   jsonObject.get("vida").getAsDouble(), 
					       jsonObject.get("arma").getAsString());
	}
	
}
