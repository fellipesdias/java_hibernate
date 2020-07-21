package aplicacao;

import dominio.pessoa;

public class Programa {

	public static void main(String[] args) {
		
		pessoa p1  = new pessoa(1, "Fellipe Soares Dias","fellipesoaresdias@gmail.com");
		pessoa p2  = new pessoa(2, "Joao das Neves","joaodasneves@gmail.com");
		pessoa p3  = new pessoa(3, "William Arao","williamarao@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
