package teste;

import adapter.AdapterData;
import adapter.Data;

public class Teste {

	public static void main(String[] args) {
		
		Data data = new AdapterData(2020, 5, 2);	
		System.out.println(data);
		
		((AdapterData) data).setDiaMes(10, 8);
		System.out.println(data);
		
		((AdapterData) data).setMesAno(10, 2021);
		System.out.println(data);
		
		((AdapterData) data).setDiaAno(5, 2022);
		System.out.println(data);
		
		((AdapterData) data).setDiaMesAno(6, 11, 2023);
		System.out.println(data);
		
	}

}
