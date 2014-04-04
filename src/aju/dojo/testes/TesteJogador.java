package aju.dojo.testes;

import java.util.ArrayList;

import org.junit.Test;

import aju.dojo.poker.Carta;
import aju.dojo.poker.Jogador;
import aju.dojo.poker.Naipe;
import aju.dojo.poker.Valor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TesteJogador {

	@Test
	public void temParNaMao() {
		Jogador j = new Jogador();
		j.name = "Lucas";
		j.mao = new ArrayList<Carta>(5);
		j.pegarCarta(Valor.AS, Naipe.COPAS);
		
	}
	
}
