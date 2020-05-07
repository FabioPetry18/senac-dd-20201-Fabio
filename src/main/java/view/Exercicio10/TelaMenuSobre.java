package view.Exercicio10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaMenuSobre extends JFrame {

	private JPanel contentPane;
	private JTextField txtGustavoBorges;
	private JTextField txtDesenvolvedorJr;
	private JTextField txtAnliseEDesenvoldimento;
	private JTextField txtFlorianpolissantaCatarina;
	private JTextField textMensagem;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenuSobre frame = new TelaMenuSobre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaMenuSobre() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textMensagem = new JTextField();
		textMensagem.setText("exemplo de Autor");
		textMensagem.setBounds(10, 143, 131, 29);
		contentPane.add(textMensagem);
		textMensagem.setColumns(10);
		
		
	}
}
