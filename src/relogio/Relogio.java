package relogio;

public class Relogio {
	
	private static Relogio instance;

	private Data data;
	private Horario horario;
	
	private Relogio() {
		data = new Data();
		horario = new Horario();
	}
	
	public static Relogio getInstance() {
		if(instance == null)
			instance = new Relogio();
		
		return instance;
	}
	
	@Override
	public String toString() {
		return ""+horario+" "+data; 
	}
	
}
