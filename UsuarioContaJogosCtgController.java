package exercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import aula.steampoo.SteamPOO;

public class UsuarioContaJogosCtgController implements ActionListener {

	private SteamPOOHash steamPOO;
	private JFrame janelaPrin;
	
	public UsuarioContaJogosCtgController(SteamPOOHash steamPOO, JFrame janela) {
		this.steamPOO = steamPOO;
		this.janelaPrin = janela;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		CategoriaDeJogo categoria = CategoriaDeJogo.ACAO;
		steamPOO.contaJogosDaCategoria(categoria);
		CategoriaDeJogo categoria1 = CategoriaDeJogo.ARCADE;
		steamPOO.contaJogosDaCategoria(categoria1);
		CategoriaDeJogo categoria2 = CategoriaDeJogo.AVENTURA;
		steamPOO.contaJogosDaCategoria(categoria2);
		CategoriaDeJogo categoria3 = CategoriaDeJogo.CORRIDA;
		steamPOO.contaJogosDaCategoria(categoria3);
		CategoriaDeJogo categoria4 = CategoriaDeJogo.GUERRA;
		steamPOO.contaJogosDaCategoria(categoria4);
		CategoriaDeJogo categoria5 = CategoriaDeJogo.LUTA;
		steamPOO.contaJogosDaCategoria(categoria5);
		CategoriaDeJogo categoria6 = CategoriaDeJogo.TERROR;
		steamPOO.contaJogosDaCategoria(categoria6);

	}

}
