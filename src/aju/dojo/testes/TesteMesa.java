package aju.dojo.testes;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import aju.dojo.poker.Carta;
import aju.dojo.poker.Jogador;
import aju.dojo.poker.Mesa;
import aju.dojo.poker.Naipe;
import aju.dojo.poker.Valor;

public class TesteMesa {
	Jogador lucas, pedro, thiago, mateus, marcelo, xavier, 
		sampaio, valentina, cristina, joao, maria, augusto, 
		jose, edson, teresa, marco, victor;
	Mesa mesa;
	
	@Before
	public void setUp() {
		lucas = new Jogador();
		lucas.name = "Lucas";
		lucas.mao = new ArrayList<Carta>(5);
		lucas.pegarCarta(Valor.AS, Naipe.COPAS);
		lucas.pegarCarta(Valor.DOIS, Naipe.PAUS);
		lucas.pegarCarta(Valor.TRES, Naipe.OUROS);
		lucas.pegarCarta(Valor.CINCO, Naipe.COPAS);
		lucas.pegarCarta(Valor.AS, Naipe.ESPADAS);
		
		pedro = new Jogador();
		pedro.name = "Pedro";
		pedro.mao = new ArrayList<Carta>(5);
		pedro.pegarCarta(Valor.DOIS, Naipe.COPAS);
		pedro.pegarCarta(Valor.DOIS, Naipe.PAUS);
		pedro.pegarCarta(Valor.TRES, Naipe.OUROS);
		pedro.pegarCarta(Valor.CINCO, Naipe.COPAS);
		pedro.pegarCarta(Valor.AS, Naipe.ESPADAS);

		thiago = new Jogador();
		thiago.name = "Thiago";
		thiago.mao = new ArrayList<Carta>(5);
		thiago.pegarCarta(Valor.VALETE, Naipe.COPAS);
		thiago.pegarCarta(Valor.VALETE, Naipe.PAUS);
		thiago.pegarCarta(Valor.SETE, Naipe.OUROS);
		thiago.pegarCarta(Valor.CINCO, Naipe.COPAS);
		thiago.pegarCarta(Valor.CINCO, Naipe.ESPADAS);

		mateus = new Jogador();
		mateus.name = "Mateus";
		mateus.mao = new ArrayList<Carta>(5);
		mateus.pegarCarta(Valor.REI, Naipe.COPAS);
		mateus.pegarCarta(Valor.REI, Naipe.PAUS);
		mateus.pegarCarta(Valor.SETE, Naipe.OUROS);
		mateus.pegarCarta(Valor.CINCO, Naipe.COPAS);
		mateus.pegarCarta(Valor.CINCO, Naipe.ESPADAS);

		marcelo = new Jogador();
		marcelo.name = "Marcelo";
		marcelo.mao = new ArrayList<Carta>(5);
		marcelo.pegarCarta(Valor.REI, Naipe.COPAS);
		marcelo.pegarCarta(Valor.REI, Naipe.PAUS);
		marcelo.pegarCarta(Valor.DOIS, Naipe.OUROS);
		marcelo.pegarCarta(Valor.VALETE, Naipe.COPAS);
		marcelo.pegarCarta(Valor.VALETE, Naipe.ESPADAS);

		xavier = new Jogador();
		xavier.name = "Xavier";
		xavier.mao = new ArrayList<Carta>(5);
		xavier.pegarCarta(Valor.REI, Naipe.COPAS);
		xavier.pegarCarta(Valor.REI, Naipe.PAUS);
		xavier.pegarCarta(Valor.AS, Naipe.OUROS);
		xavier.pegarCarta(Valor.VALETE, Naipe.COPAS);
		xavier.pegarCarta(Valor.VALETE, Naipe.ESPADAS);

		sampaio = new Jogador();
		sampaio.name = "Sampaio";
		sampaio.mao = new ArrayList<Carta>(5);
		sampaio.pegarCarta(Valor.VALETE, Naipe.COPAS);
		sampaio.pegarCarta(Valor.VALETE, Naipe.PAUS);
		sampaio.pegarCarta(Valor.VALETE, Naipe.OUROS);
		sampaio.pegarCarta(Valor.DEZ, Naipe.COPAS);
		sampaio.pegarCarta(Valor.DEZ, Naipe.ESPADAS);

		valentina = new Jogador();
		valentina.name = "Valentina";
		valentina.mao = new ArrayList<Carta>(5);
		valentina.pegarCarta(Valor.VALETE, Naipe.COPAS);
		valentina.pegarCarta(Valor.VALETE, Naipe.PAUS);
		valentina.pegarCarta(Valor.VALETE, Naipe.OUROS);
		valentina.pegarCarta(Valor.VALETE, Naipe.ESPADAS);
		valentina.pegarCarta(Valor.DEZ, Naipe.ESPADAS);

		cristina = new Jogador();
		cristina.name = "Cristina";
		cristina.mao = new ArrayList<Carta>(5);
		cristina.pegarCarta(Valor.REI, Naipe.COPAS);
		cristina.pegarCarta(Valor.REI, Naipe.PAUS);
		cristina.pegarCarta(Valor.REI, Naipe.OUROS);
		cristina.pegarCarta(Valor.REI, Naipe.ESPADAS);
		cristina.pegarCarta(Valor.DEZ, Naipe.ESPADAS);

		joao = new Jogador();
		joao.name = "Joao";
		joao.mao = new ArrayList<Carta>(5);
		joao.pegarCarta(Valor.AS, Naipe.COPAS);
		joao.pegarCarta(Valor.AS, Naipe.PAUS);
		joao.pegarCarta(Valor.AS, Naipe.OUROS);
		joao.pegarCarta(Valor.DEZ, Naipe.ESPADAS);
		joao.pegarCarta(Valor.DEZ, Naipe.ESPADAS);

		maria = new Jogador();
		maria.name = "Maria";
		maria.mao = new ArrayList<Carta>(5);
		maria.pegarCarta(Valor.VALETE, Naipe.COPAS);
		maria.pegarCarta(Valor.VALETE, Naipe.PAUS);
		maria.pegarCarta(Valor.VALETE, Naipe.OUROS);
		maria.pegarCarta(Valor.OITO, Naipe.COPAS);
		maria.pegarCarta(Valor.DEZ, Naipe.ESPADAS);

		augusto = new Jogador();
		augusto.name = "Augusto";
		augusto.mao = new ArrayList<Carta>(5);
		augusto.pegarCarta(Valor.RAINHA, Naipe.COPAS);
		augusto.pegarCarta(Valor.RAINHA, Naipe.PAUS);
		augusto.pegarCarta(Valor.RAINHA, Naipe.OUROS);
		augusto.pegarCarta(Valor.DOIS, Naipe.COPAS);
		augusto.pegarCarta(Valor.TRES, Naipe.ESPADAS);

		jose = new Jogador();
		jose.name = "Jose";
		jose.mao = new ArrayList<Carta>(5);
		jose.pegarCarta(Valor.RAINHA, Naipe.ESPADAS);
		jose.pegarCarta(Valor.REI, Naipe.ESPADAS);
		jose.pegarCarta(Valor.AS, Naipe.ESPADAS);
		jose.pegarCarta(Valor.DEZ, Naipe.ESPADAS);
		jose.pegarCarta(Valor.VALETE, Naipe.ESPADAS);

		edson = new Jogador();
		edson.name = "Edson";
		edson.mao = new ArrayList<Carta>(5);
		edson.pegarCarta(Valor.RAINHA, Naipe.ESPADAS);
		edson.pegarCarta(Valor.REI, Naipe.OUROS);
		edson.pegarCarta(Valor.AS, Naipe.PAUS);
		edson.pegarCarta(Valor.DEZ, Naipe.COPAS);
		edson.pegarCarta(Valor.VALETE, Naipe.ESPADAS);

		teresa = new Jogador();
		teresa.name = "Teresa";
		teresa.mao = new ArrayList<Carta>(5);
		teresa.pegarCarta(Valor.DEZ, Naipe.OUROS);
		teresa.pegarCarta(Valor.OITO, Naipe.OUROS);
		teresa.pegarCarta(Valor.AS, Naipe.OUROS);
		teresa.pegarCarta(Valor.DOIS, Naipe.OUROS);
		teresa.pegarCarta(Valor.VALETE, Naipe.OUROS);

		marco = new Jogador();
		marco.name = "Marco";
		marco.mao = new ArrayList<Carta>(5);
		marco.pegarCarta(Valor.RAINHA, Naipe.ESPADAS);
		marco.pegarCarta(Valor.REI, Naipe.OUROS);
		marco.pegarCarta(Valor.NOVE, Naipe.PAUS);
		marco.pegarCarta(Valor.DEZ, Naipe.COPAS);
		marco.pegarCarta(Valor.VALETE, Naipe.ESPADAS);

		victor = new Jogador();
		victor.name = "Victor";
		victor.mao = new ArrayList<Carta>(5);
		victor.pegarCarta(Valor.RAINHA, Naipe.ESPADAS);
		victor.pegarCarta(Valor.REI, Naipe.ESPADAS);
		victor.pegarCarta(Valor.NOVE, Naipe.ESPADAS);
		victor.pegarCarta(Valor.DEZ, Naipe.ESPADAS);
		victor.pegarCarta(Valor.VALETE, Naipe.ESPADAS);
		
		mesa = new Mesa();
	}
	
	@Test
	public void retornarMaiorCarta() {
		Carta cartaMaisAlta = mesa.cartaMaisAlta(lucas);
		assertEquals(Valor.AS, cartaMaisAlta.valor);
		
		cartaMaisAlta = mesa.cartaMaisAlta(thiago);
		assertNotEquals(Valor.AS, cartaMaisAlta.valor);
	}

	@Test
	public void umPar() {
		assertTrue(mesa.temPar(lucas));
		
		assertTrue(mesa.temPar(thiago));
		
		assertTrue(mesa.temPar(sampaio));
		
		assertFalse(mesa.temPar(valentina));
	}
	
	@Test 
	public void doisPares() {
		assertFalse(mesa.temDoisPares(lucas));
		
		assertTrue(mesa.temDoisPares(thiago));
		
		assertFalse(mesa.temDoisPares(sampaio));
		
		assertFalse(mesa.temDoisPares(valentina));
	}
	
	@Test
	public void trinca() {
		assertFalse(mesa.temTrinca(lucas));
		
		assertFalse(mesa.temTrinca(thiago));
		
		assertTrue(mesa.temTrinca(sampaio));
		
		assertFalse(mesa.temTrinca(valentina));
	}
	
	@Test
	public void fullHouse() {
		assertFalse(mesa.temFullHouse(lucas));
		
		assertFalse(mesa.temFullHouse(thiago));
		
		assertTrue(mesa.temFullHouse(sampaio));
		
		assertFalse(mesa.temFullHouse(valentina));
	}
	
	@Test
	public void quadra() {
		assertFalse(mesa.temQuadra(lucas));
		
		assertFalse(mesa.temQuadra(thiago));
		
		assertFalse(mesa.temQuadra(sampaio));
		
		assertTrue(mesa.temQuadra(valentina));
	}
	
	@Test 
	public void parDoisPares() {
		Jogador quemGanhou = mesa.quemGanhou(lucas, thiago);
		
		assertEquals("Thiago", quemGanhou.name);
	}
	
	@Test 
	public void parTrinca() {
		Jogador quemGanhou = mesa.quemGanhou(lucas, maria);
		
		assertEquals("Maria", quemGanhou.name);
	}
	
	@Test 
	public void fullHouseTrinca() {
		Jogador quemGanhou = mesa.quemGanhou(sampaio, maria);
		
		assertEquals("Sampaio", quemGanhou.name);
	}
	
	@Test 
	public void straightFullHouse() {
		Jogador quemGanhou = mesa.quemGanhou(edson, cristina);
		
		assertEquals("Cristina", quemGanhou.name);
	}
	
	@Test 
	public void straightDoisPares() {
		Jogador quemGanhou = mesa.quemGanhou(edson, thiago);
		
		assertEquals("Edson", quemGanhou.name);
	}
	
	@Test 
	public void straightPar() {
		Jogador quemGanhou = mesa.quemGanhou(edson, lucas);
		
		assertEquals("Edson", quemGanhou.name);
	}
	
	@Test 
	public void straightTrinca() {
		Jogador quemGanhou = mesa.quemGanhou(edson, maria);
		
		assertEquals("Edson", quemGanhou.name);
	}
	
	@Test 
	public void straightFlushQuadra() {
		Jogador quemGanhou = mesa.quemGanhou(jose, valentina);
		
		assertEquals("Jose", quemGanhou.name);
	}
	
	@Test 
	public void flushStraight() {
		Jogador quemGanhou = mesa.quemGanhou(teresa, edson);
		
		assertEquals("Teresa", quemGanhou.name);
	}
	
	@Test 
	public void empateQuadra() {
		Jogador quemGanhou = mesa.quemGanhou(valentina, cristina);
		
		assertEquals("Cristina", quemGanhou.name);
	}
	
	@Test
	public void quadraFullHouse() {
		Jogador quemGanhou = mesa.quemGanhou(cristina, joao);
		
		assertEquals("Cristina", quemGanhou.name);
	}
	
	@Test
	public void empateFullHouse() {
		Jogador quemGanhou = mesa.quemGanhou(sampaio, joao);
		
		assertEquals("Joao", quemGanhou.name);
	}
	
	@Test
	public void empateTrinca() {
		Jogador quemGanhou = mesa.quemGanhou(maria, augusto);
		
		assertEquals("Augusto", quemGanhou.name);
	}
	
	@Test
	public void empateStraightFlush() {
		Jogador quemGanhou = mesa.quemGanhou(victor, jose);
		
		assertEquals("Jose", quemGanhou.name);
	}
	
	@Test
	public void empatePar() {
		Jogador quemGanhou = mesa.quemGanhou(lucas, pedro);
		
		assertEquals("Lucas", quemGanhou.name);
	}
	
	@Test
	public void empateDoisPares() {
		Jogador quemGanhou = mesa.quemGanhou(thiago, mateus);
		
		assertEquals("Mateus", quemGanhou.name);
	}
	
	@Test
	public void empateDoisParesParcialmenteIgual() {
		Jogador quemGanhou = mesa.quemGanhou(marcelo, mateus);
		
		assertEquals("Marcelo", quemGanhou.name);
	}
	
	@Test
	public void empateDoisParesIguais() {
		Jogador quemGanhou = mesa.quemGanhou(marcelo, xavier);
		
		assertEquals("Xavier", quemGanhou.name);
	}
	
}