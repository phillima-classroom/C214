package br.inatel.cdg;

import br.inatel.cdg.cafeteria.bebidas.Bebida;
import br.inatel.cdg.cafeteria.bebidas.Espresso;
import br.inatel.cdg.cafeteria.bebidas.Cappuccino;
import br.inatel.cdg.cafeteria.condimentos.Canela;
import br.inatel.cdg.cafeteria.condimentos.Pacoca;

public class App {
	
	public static void main(String[] args) {
		Bebida bebida = new Espresso();
		
		System.out.println(bebida.getDescricao() + " R$ " + bebida.preco());
		
		Bebida bebida2 = new Cappuccino();
		bebida2 = new Pacoca(bebida2);
		bebida2 = new Pacoca(bebida2);
		bebida2 = new Canela(bebida2);
		
		System.out.println(bebida2.getDescricao() + " R$ " + bebida2.preco());
		
	}

}