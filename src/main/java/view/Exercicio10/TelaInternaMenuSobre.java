package view.Exercicio10;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public class TelaInternaMenuSobre extends JInternalFrame {
	private JTextField textInternaAutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInternaMenuSobre frame = new TelaInternaMenuSobre();
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
	public TelaInternaMenuSobre() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		textInternaAutor = new JTextField();
		textInternaAutor.setText("exemplo de autor");
		textInternaAutor.setBounds(10, 84, 86, 20);
		getContentPane().add(textInternaAutor);
		textInternaAutor.setColumns(10);

	}

}
