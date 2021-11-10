package br.inatel.cdg;

import br.inatel.cdg.clima.ClimaDados;
import br.inatel.cdg.display.CondicoesCorrentes;
import br.inatel.cdg.display.PrevisaoDisplay;

public class App {

	public static void main(String[] args) {
		
		ClimaDados clima = new ClimaDados();
		
		CondicoesCorrentes correnteDisplay = new CondicoesCorrentes(clima);
		PrevisaoDisplay previsaoDisplay = new PrevisaoDisplay(clima,19);
		
		clima.setMudancas(15, 65, 30);
		clima.setMudancas(17, 90, 29.4);
		
	}

}
