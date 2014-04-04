package aju.dojo.poker;

public enum ValorDaJogada {
	STRAIGHT_FLUSH(8), QUADRA(7), FULL_HOUSE(6), FLUSH(5), STRAIGHT(4), TRINCA(3), DOIS_PARES(2), PAR(1), CARTA_ALTA(0);
	
	private int valorJogada;
	
	private ValorDaJogada(int valorJogada) {
		this.valorJogada = valorJogada;
	}
	
	public int getValorJogada() {
		return valorJogada;
	}
}
