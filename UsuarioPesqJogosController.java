package exercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UsuarioPesqJogosController implements ActionListener {
	
	private SteamPOOHash steamPOO;
	private JFrame janelaPrin;
	
	public UsuarioPesqJogosController(SteamPOOHash steamPOO, JFrame janela) {
		this.steamPOO = steamPOO;
		this.janelaPrin = janela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nomeDeJogo = JOptionPane.showInputDialog(janelaPrin, "Dígite o nome do Jogo:  ");
		boolean existeJogo = steamPOO.existeJogoComNome(nomeDeJogo);
		if(existeJogo) {
			JOptionPane.showMessageDialog(janelaPrin, "Jogo existe no sistema");
		} else {
			JOptionPane.showMessageDialog(janelaPrin, "Jogo não encontrado no nosso banco de dados");
		}
		
		CategoriaDeJogo categorias = CategoriaDeJogo.ACAO;
		steamPOO.pesquisaJogosDaCategoria(categorias);
		CategoriaDeJogo categorias1 = CategoriaDeJogo.ARCADE;
		steamPOO.pesquisaJogosDaCategoria(categorias1);
		CategoriaDeJogo categorias2 = CategoriaDeJogo.AVENTURA;
		steamPOO.pesquisaJogosDaCategoria(categorias2);
		CategoriaDeJogo categorias3 = CategoriaDeJogo.CORRIDA;
		steamPOO.pesquisaJogosDaCategoria(categorias3);
		CategoriaDeJogo categorias4 = CategoriaDeJogo.GUERRA;
		steamPOO.pesquisaJogosDaCategoria(categorias4);
		CategoriaDeJogo categorias5 = CategoriaDeJogo.LUTA;
		steamPOO.pesquisaJogosDaCategoria(categorias5);
		CategoriaDeJogo categorias6 = CategoriaDeJogo.TERROR;
		steamPOO.pesquisaJogosDaCategoria(categorias6);
		
	}

}
