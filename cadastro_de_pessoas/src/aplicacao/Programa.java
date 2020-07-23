package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1  = new Pessoa(1, "Fellipe Soares Dias","fellipesoaresdias@gmail.com");
		Pessoa p2  = new Pessoa(2, "Joao das Neves","joaodasneves@gmail.com");
		Pessoa p3  = new Pessoa(3, "William Arao","williamarao@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
