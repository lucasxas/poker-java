package aju.dojo.poker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Mesa {
	
	/**
	 * Método <b>principal</b> do jogo de Poker
	 * @param jogador1 
	 * @param jogador2
	 * @return o Jogador que ganhou a partida
	 */
	public Jogador quemGanhou(Jogador jogador1, Jogador jogador2) {
		ValorDaJogada pontuacao1 = pontuacaoMelhorJogada(jogador1);
		ValorDaJogada pontuacao2 = pontuacaoMelhorJogada(jogador2);
		
		if ( pontuacao1.getValorJogada() == pontuacao2.getValorJogada()) {
			return resolverEmpate(pontuacao1, jogador1, jogador2); 
		} else {
			return pontuacao1.getValorJogada() > pontuacao2.getValorJogada() ? jogador1 : jogador2;
		}
	}
	
	/**
	 * Caso os dois jogadores tenham a mesma jogada, essa função descobre quem ganhou
	 * @param pontuacao
	 * @param jogador1
	 * @param jogador2
	 * @return
	 */
	private Jogador resolverEmpate(ValorDaJogada pontuacao, Jogador jogador1, Jogador jogador2) {
		switch (pontuacao) {
			case QUADRA:
				return resolverEmpateQuadra(jogador1, jogador2);
			case FULL_HOUSE:
			case TRINCA:
				return resolverEmpateTrinca(jogador1, jogador2);
			case STRAIGHT_FLUSH:
			case FLUSH:
			case STRAIGHT:
			case CARTA_ALTA:
			default:
				return resolverEmpateCartaMaisAlta(jogador1, jogador2);
			case PAR:
				return resolverEmpatePar(jogador1, jogador2);
			case DOIS_PARES:
				return resolverEmpateDoisPares(jogador1, jogador2);
		}
	}

	private Jogador resolverEmpateDoisPares(Jogador jogador1, Jogador jogador2) {
		List<Carta> mao1 = new ArrayList<Carta>(jogador1.mao);
		Carta par1Jog1 = par(jogador1.mao);
		Carta par2Jog1 = par(jogador1.mao);

		List<Carta> mao2 = new ArrayList<Carta>(jogador2.mao);
		Carta par1Jog2 = par(jogador2.mao);
		Carta par2Jog2 = par(jogador2.mao);
		
		// Primeiro testa os maiores Pares
		if (par2Jog1.maiorQue(par2Jog2)) {
			// Se o maior par for o do jogador 1
			return jogador1;
		} else if (par2Jog2.maiorQue(par2Jog1)) {
			// Se o maior par for o do jogador 2
			return jogador2;
		} else if (par1Jog1.maiorQue(par1Jog2)) { // Depois testamos os Pares menores
			return jogador1;
		} else if (par1Jog2.maiorQue(par1Jog1)) {
			return jogador2;
		} else { // Em caso de empate...
			// Restaura as maos ao estado inicial e compara a carta maior
			jogador1.mao = mao1;
			jogador2.mao = mao2;
			
			return resolverEmpateCartaMaisAlta(jogador1, jogador2);
		}
		
	}

	private Jogador resolverEmpatePar(Jogador jogador1, Jogador jogador2) {
		return par(jogador1.mao).maiorQue(par(jogador2.mao)) ? jogador1: jogador2;
	}

	private Jogador resolverEmpateCartaMaisAlta(Jogador jogador1, Jogador jogador2) {
		return cartaMaisAlta(jogador1).maiorQue(cartaMaisAlta(jogador2)) ? jogador1 : jogador2;
	}

	private Jogador resolverEmpateQuadra(Jogador jogador1, Jogador jogador2) {
		return quadra(jogador1.mao).maiorQue(quadra(jogador2.mao)) ? jogador1 : jogador2;
	}
	
	private Jogador resolverEmpateTrinca(Jogador jogador1, Jogador jogador2) {
		return trinca(jogador1.mao).maiorQue(trinca(jogador2.mao)) ? jogador1 : jogador2;
	}

	/**
	 * Descobre qual a jogada de pontuação mais alta que o jogador possui
	 * @param jogador
	 * @return
	 */
	public ValorDaJogada pontuacaoMelhorJogada(Jogador jogador) {
		Collections.sort(jogador.mao);
		
		if (temStraightFlush(jogador)) {
			return ValorDaJogada.STRAIGHT_FLUSH;
		} else if (temQuadra(jogador)) {
			return ValorDaJogada.QUADRA;
		} else if (temFullHouse(jogador)) {
			return ValorDaJogada.FULL_HOUSE;
		} else if (temFlush(jogador)) {
			return ValorDaJogada.FLUSH;
		} else if (temStraight(jogador)) {
			return ValorDaJogada.STRAIGHT;
		} else if (temTrinca(jogador)) {
			return ValorDaJogada.TRINCA;
		} else if (temDoisPares(jogador)) {
			return ValorDaJogada.DOIS_PARES;
		} else if (temPar(jogador)) {
			return ValorDaJogada.PAR;
		} else {
			return ValorDaJogada.CARTA_ALTA;
		}
	}
	
	public Carta cartaMaisAlta(Jogador jogador) {
		Carta maisAlta = null;
		for (Carta carta : jogador.mao) {
			if (maisAlta == null || carta.maiorQue(maisAlta)) {
				maisAlta = carta;
			}
		}
		
		return maisAlta;
	}

	public boolean temPar(Jogador jogador) {
		List<Carta> mao = new ArrayList<Carta>(jogador.mao);
		return par(mao) != null;
	}
	
	public boolean temDoisPares(Jogador jogador) {
		List<Carta> mao = new ArrayList<Carta>(jogador.mao);
		return par(mao) != null && par(mao) != null;
	}
	
	private Carta par(List<Carta> mao) {
		if (mao.isEmpty()) {
			return null;
		}
		Carta cartaAtual = mao.remove(0);
		List<Carta> repetidas = new ArrayList<Carta>(4);
		repetidas.add(cartaAtual);
		for (Carta carta : mao) {
			if (cartaAtual.par(carta)) {
				repetidas.add(carta);
			}
		}
		mao.removeAll(repetidas);
		
		return repetidas.size() == 2 ? cartaAtual : par(mao);
	}

	public boolean temTrinca(Jogador jogador) {
		List<Carta> mao = new ArrayList<Carta>(jogador.mao);
		return trinca(mao) != null;
	}

	private Carta trinca(List<Carta> mao) {
		if (mao.isEmpty()) {
			return null;
		}
		Carta cartaAtual = mao.remove(0);
		List<Carta> repetidas = new ArrayList<Carta>(4);
		repetidas.add(cartaAtual);
		for (Carta carta : mao) {
			if (cartaAtual.par(carta)) {
				repetidas.add(carta);
			}
		}
		mao.removeAll(repetidas);
		
		return repetidas.size() == 3 ? cartaAtual : trinca(mao);
	}
	
	private boolean temStraight(Jogador jogador) {
		List<Carta> mao = new ArrayList<Carta>(jogador.mao);
		return straight(mao) != null;
	}
	
	private Carta straight(List<Carta> mao) {
		for (int i = 0; i < mao.size() -1; i++) {
			Carta atual = mao.get(i);
			Carta proxima = mao.get(i+1);
			
			if (proxima.valor.getValor() - atual.valor.getValor() != 1) {
				return null;
			}
		}
		
		return mao.get(mao.size()-1);
	}

	private boolean temFlush(Jogador jogador) {
		List<Carta> mao = new ArrayList<Carta>(jogador.mao);
		return temFlush(mao) != null;
	}

	private Carta temFlush(List<Carta> mao) {
		Naipe naipe = mao.remove(0).naipe;
		
		for(Carta carta : mao) {
			if (carta.naipe != naipe) {
				return null;
			}
		}
		
		return mao.get(mao.size()-1);
	}

	public boolean temQuadra(Jogador jogador) {
		List<Carta> mao = new ArrayList<Carta>(jogador.mao);
		return quadra(mao) != null;
	}

	private Carta quadra(List<Carta> mao) {
		if (mao.isEmpty()) {
			return null;
		}
		Carta cartaAtual = mao.remove(0);
		List<Carta> repetidas = new ArrayList<Carta>(4);
		repetidas.add(cartaAtual);
		for (Carta carta : mao) {
			if (cartaAtual.par(carta)) {
				repetidas.add(carta);
			}
		}
		mao.removeAll(repetidas);
		
		return repetidas.size() == 4 ? cartaAtual : quadra(mao);
	}

	public boolean temFullHouse(Jogador jogador) {
		return temPar(jogador) && temTrinca(jogador);
	}

	private boolean temStraightFlush(Jogador jogador) {
		return temStraight(jogador) && temFlush(jogador);
	}
}
