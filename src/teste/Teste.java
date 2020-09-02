package teste;

import factorymethod.Triangulo;

public class Teste {

	public static void main(String[] args) {

		Triangulo tr = new Triangulo();
		
		tr.setLado1(6.0f);
		tr.setLado2(6.0f);
		tr.setLado3(6.0f);
		
		System.out.println(tr.getTipoFigura());
		
	}

}
