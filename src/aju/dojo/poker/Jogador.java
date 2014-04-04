package aju.dojo.poker;

import java.util.List;

public class Jogador {
	public String name;
	public List<Carta> mao;
	
	public void pegarCarta(Valor valor, Naipe naipe) {
		mao.add(new Carta(valor, naipe));
	}

}
