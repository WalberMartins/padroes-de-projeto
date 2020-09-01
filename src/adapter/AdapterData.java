package adapter;

public class AdapterData extends Data {
	
	public AdapterData(int ano, int mes, int dia) {
		super(dia, mes, ano);
	}
	
	public void setDiaMes(int dia, int mes) {
		super.setMes(mes);
		super.setDia(dia);
	}
	
	public void setMesAno(int mes, int ano) {
		super.setAno(ano);
		super.setMes(mes);
	}
	
	public void setDiaAno(int dia, int ano) {
		super.setAno(ano);
		super.setDia(dia);
	}
	
	public void setDiaMesAno(int dia, int mes, int ano) {
		super.setAno(ano);
		super.setMes(mes);
		super.setDia(dia);
	}
	
}
