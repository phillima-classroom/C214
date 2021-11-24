package br.inatel.cdg.simple.factory.pizza;

public class Pizzaria {

	private String tipo = "";
	private SimplePizzaFactory fabricaPizza;
	
	public Pizzaria(SimplePizzaFactory fabricaPizza) {
		this.fabricaPizza = fabricaPizza;
	}
	
	public Pizza encomendarPizza(String tipo) {
		
		Pizza p;
		
		p = fabricaPizza.criaPizza(tipo);
		
		p.preparar();
		p.assar();
		p.fatiar();
		p.empacotar();
		
		return p;
	}
	
}
