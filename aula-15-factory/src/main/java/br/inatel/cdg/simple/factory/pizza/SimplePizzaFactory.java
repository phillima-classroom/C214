package br.inatel.cdg.simple.factory.pizza;

public class SimplePizzaFactory {

	public Pizza criaPizza(String tipo) {
		
		Pizza p = null;
		
		if(tipo == "Calabresa")
			p = new PizzaCalabresa();
		else if(tipo == "Frango")
			p = new PizzaFrango();
		else if(tipo == "Portuguesa")
			p = new PizzaPortuguesa();
		else
			p = new PizzaMozarela();
		
		return p;
	}
	
}
