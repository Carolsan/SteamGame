package exercicio5;

import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class ProgramaSteamPOO {
	
	public static void main(String[] args) {
		final JFrame janela = new Usuario();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		janela.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				int resp = JOptionPane.showConfirmDialog(janela, "Tem certeza que quer sair?");
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}

}


