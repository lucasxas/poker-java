package aju.dojo.poker;

public class Carta implements Comparable<Carta>{
	public Valor valor;
	public Naipe naipe;
	
	public Carta(Valor valor, Naipe naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}
	
	@Override
	public String toString() {
		return valor +"_DE_"+ naipe;
	}
	
	/***
	 * @param outraCarta A carta a ser comparada
	 * @return Verdadeiro se a carta atual (this) tiver mesmo Valor que outraCarta
	 */
	public boolean par(Carta outraCarta) {
		return outraCarta != null && valor == outraCarta.valor;
	}

	/***
	 * @param outraCarta A carta a ser comparada
	 * @return Verdadeiro se a carta atual (this) for maior que a outraCarta
	 */
	public boolean maiorQue(Carta outraCarta) {
		return valor.getValor() > outraCarta.valor.getValor();
	}
	
	@Override
	public int compareTo(Carta outraCarta) {
		return valor.getValor().compareTo(outraCarta.valor.getValor()); 
	}

}
