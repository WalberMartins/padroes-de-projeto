package adapter;

public class Data {
	
	private short ano;
	private byte mes;
	private byte dia;
	
	public Data() {
		ano = 2020;
		mes = 5;
		dia = 2;
	}
	
	public Data(int dia, int mes, int ano) {
		setAno((short) ano);
		setMes((byte) mes);
		setDia((byte) dia);
	}

	public short getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano > 0 && ano <= 9999)
			this.ano = (short) ano;
	}

	public byte getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes > 0 && mes <= 12)
			this.mes = (byte) mes;
	}

	public byte getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if(dia > 0 && dia <= 31)
			this.dia = (byte) dia;
	}
	
	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}
	
}