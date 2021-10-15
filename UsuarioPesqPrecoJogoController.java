package exercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UsuarioPesqPrecoJogoController implements ActionListener {

	private SteamPOOHash steamPOO;
	private JFrame janelaPrin;
	
	public UsuarioPesqPrecoJogoController(SteamPOOHash steamPOO, JFrame janela) {
		this.steamPOO = steamPOO;
		this.janelaPrin = janela;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nome = JOptionPane.showInputDialog(janelaPrin, "Dígite o nome do jogo à pesquisar");
		try {
			steamPOO.pesquisaPrecoDoJogo(nome);
		} catch (JogoInexistenteException e1) {
			JOptionPane.showMessageDialog(janelaPrin, e1.getMessage());
		}
	}

}
