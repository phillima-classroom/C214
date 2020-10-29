package  br.inatel.cdg.display;

import br.inatel.cdg.clima.ClimaDados;
import br.inatel.cdg.clima.observer.Observer;

public class PrevisaoDisplay implements Observer, Display {
	private double temperaturaAntiga;  
	private double temperaturaAtual;
	private ClimaDados climaDados;

	public PrevisaoDisplay(ClimaDados climaDados, double tempReferencia) {
		this.climaDados = climaDados;
		this.temperaturaAtual = tempReferencia;
		climaDados.registraObservador(this);
	}

	@Override
	public void update(double temperatura, double umidade, double pressao) {
		temperaturaAntiga = temperaturaAtual;
		temperaturaAtual = temperatura;
		display();
	}

	@Override
	public void display() {
		System.out.println("Temperatura mudou de " 
					+ temperaturaAntiga + " para " + temperaturaAtual);
		System.out.print("Previsão: ");
		if (temperaturaAtual > temperaturaAntiga) {
			System.out.println("Pode esquentar. Fique em casa jogando");
		} else if (temperaturaAntiga == temperaturaAtual) {
			System.out.println("Sem novidades. Mais do mesmo!");
		} else if (temperaturaAtual < temperaturaAntiga) {
			System.out.println("Pode esfriar. Fique em casa montando puzzle!");
		}
	}

}
