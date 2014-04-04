package aju.dojo.poker;

public enum Naipe {
	ESPADAS('S'), COPAS('H'), OUROS('D'), PAUS('C');
	
	private char abreviacao;
	
	private Naipe(char abreviacao) {
		this.abreviacao = abreviacao;
	}
	
	public char getAbreviacao() {
		return abreviacao;
	}
}
