package aju.dojo.poker;

public enum Valor {
	DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10), 
	VALETE(11), RAINHA(12), REI(13), AS(14);
	
	private int valor;
	
	private Valor(int valor) {
		this.valor = valor;
	}
	
	public Integer getValor() {
		return valor;
	}

}
