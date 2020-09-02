package principal;

import relogio.Data;
import relogio.Horario;
import relogio.Relogio;

public class Principal {
	
	public static void main(String[] args) {
		Data data = new Data();
		
		Horario horario = new Horario();
		
		System.out.println(data);
		System.out.println(horario);
		
		Relogio relogio = Relogio.getInstance();
		Relogio relogio2 = Relogio.getInstance();
		Relogio relogio3 = Relogio.getInstance();
		
		System.out.println(relogio);
		System.out.println(relogio2);
		System.out.println(relogio3);
		
	}
	
}
