package relogio;

public class Horario {
	
	private byte hora;
	private byte minuto;
	private byte segundo;
	
	public Horario() {
		hora = 0;
		minuto = 0;
		segundo = 0;
	}
	
	public Horario(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}

	public byte getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora >= 0 && hora <= 23){
			this.hora = (byte)hora;
		}
	}

	public byte getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto <= 59){
			this.minuto = (byte)minuto;
		}
	}

	public byte getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo >= 0 && segundo <= 59){
			this.segundo = (byte)segundo;
		}
		
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
	
}
