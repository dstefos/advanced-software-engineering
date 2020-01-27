


import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class PokedexPokemon {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokedexPokemon window = new PokedexPokemon();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PokedexPokemon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 609, 602);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnChoosePokemon = new JButton("Enter pokedex");
		btnChoosePokemon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnChoosePokemon.setBackground(UIManager.getColor("Button.darkShadow"));
		btnChoosePokemon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PockedexScreen pd = new PockedexScreen();
				pd.setVisible(true);
				
			}
		});
		btnChoosePokemon.setBounds(10, 523, 123, 30);
		frame.getContentPane().add(btnChoosePokemon);
		
		JButton btnExit = new JButton("Exit\r\n");
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				System.exit(0);
			}
		});
		btnExit.setBackground(UIManager.getColor("Button.darkShadow"));
		btnExit.setBounds(143, 523, 71, 30);
		frame.getContentPane().add(btnExit);
		
		JLabel backgroundLabel = new JLabel("New label");
		backgroundLabel.setIcon(new ImageIcon(PokedexPokemon.class.getResource("Pokemon.jpg")));
		backgroundLabel.setBounds(0, -11, 593, 575);
		frame.getContentPane().add(backgroundLabel);
	}
}
