package exercicio5;


import static org.junit.jupiter.api.Assertions.*;

import  org.junit.jupiter.api.Test;

public class SteamPOOHashTest {

	@Test
	void testaCadastroDeJogo() {
		SteamPOOHash sistema = new SteamPOOHash();
		Jogo jogo = new Jogo("Zelda");
		jogo.adicionaCategoria(CategoriaDeJogo.ARCADE);
		try {
			sistema.cadastraJogo(jogo);
		} catch (JogoJaExisteException e) {
			fail("Não deveria ter lançado exceção");
		}
		assertTrue(sistema.existeJogoComNome("Zelda"));
		int cont = sistema.contaJogosDaCategoria(CategoriaDeJogo.ARCADE);
		assertEquals(1,cont);
		assertTrue(sistema.existeJogoComNome("Zelda"));
		try {
			assertEquals(0.0, sistema.pesquisaPrecoDoJogo("Zelda"));
		} catch (JogoInexistenteException e) {
			fail("Deveria existir o jogo");
		}
		
	}
	
}
