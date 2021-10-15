package exercicio5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Usuario extends JFrame {
	
	JLabel lin1, lin2;
	JButton botaoPesqJogos, botaoPesqPrecoJogo, botaoContaJogosCtg;
	SteamPOOHash steamPOO = new SteamPOOHash();
	
	public Usuario() {
		setTitle("Steam Caroll Games");
		setSize(800,700);
		setLocation(150,150);
		setResizable(false);
		setBackground(Color.yellow);
		lin1 = new JLabel("Plataforma Do Usuário", JLabel.CENTER);
		lin1.setForeground(Color.black);
		lin1.setFont(new Font("Serif", Font.BOLD, 25));
		lin1 = new JLabel("Bem-vindo!", JLabel.CENTER);
		lin1.setForeground(Color.blue);
		lin1.setFont(new Font("Serif", Font.BOLD, 35));
		
		botaoPesqJogos = new JButton("Pesquisar jogos da categoria");
		botaoPesqJogos.addActionListener(new UsuarioPesqJogosController(steamPOO, this));
		botaoPesqPrecoJogo = new JButton("Pesquisar preço do jogo");
		botaoPesqPrecoJogo.addActionListener(new UsuarioPesqPrecoJogoController(steamPOO, this));
		botaoContaJogosCtg = new JButton("Quantidade de jogos da categoria");
		botaoContaJogosCtg.addActionListener(new UsuarioContaJogosCtgController(steamPOO, this));
		
	}
	
}
