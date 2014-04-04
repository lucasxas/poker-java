package aju.dojo.testes;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aju.dojo.poker.Carta;
import aju.dojo.poker.Naipe;
import aju.dojo.poker.Valor;


public class TesteCarta {
	Carta asCopas, doisEspadas, doisOuros;
	
	@Before
	public void setUp() {
		asCopas = new Carta(Valor.AS, Naipe.COPAS);
		
		doisEspadas = new Carta(Valor.DOIS, Naipe.ESPADAS);
		
		doisOuros = new Carta(Valor.DOIS, Naipe.OUROS);
	}
	
	@Test
	public void testaCartaComLetra() {
		assertEquals(Valor.AS, asCopas.valor);
		assertEquals(Naipe.COPAS, asCopas.naipe);
	}
	
	@Test
	public void testaCartaComNumero() {
		assertEquals(Valor.DOIS, doisEspadas.valor);
		assertEquals(Naipe.ESPADAS, doisEspadas.naipe);
	}
	
	@Test 
	public void testaCartasPares() {
		assertTrue(doisOuros.par(doisEspadas));
		assertTrue(doisEspadas.par(doisOuros));
	}
	
	@Test
	public void testaCartasNaoPares() {
		assertFalse(doisOuros.par(asCopas));
		assertFalse(asCopas.par(doisOuros));
	}
	
	@Test
	public void testaCartaMaior() {
		assertTrue(asCopas.maiorQue(doisEspadas));
		assertTrue(asCopas.maiorQue(doisOuros));
		
		assertFalse(doisEspadas.maiorQue(asCopas));
		assertFalse(doisOuros.maiorQue(asCopas));
		
		assertFalse(doisEspadas.maiorQue(doisOuros));
	}

}
