


import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class PokedexPokemon extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokedexPokemon window = new PokedexPokemon(100, 100, 600, 550, 5, 5, 5, 5);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	
//	Render window
	private JPanel renderAppWindow(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, width, height);
		GUIBuilder window = new GUIBuilder(x, y, width, height, borderTop, borderLeft, borderBottom, borderRight);
		setContentPane(window);
		return window;
	}
	
	public PokedexPokemon(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) {

//		Render window
		JPanel window = renderAppWindow(x, y, width, height, borderTop, borderLeft, borderBottom, borderRight);

//		Render a button that shows PokedexScreen when clicked		
		JButton btnShowPokedexScreen = GUIBuilder.addButton("Enter Pokedex", Color.BLACK, UIManager.getColor("Button.darkShadow"), 10, 450, 123, 30, window, null, Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnShowPokedexScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PockedexScreen pd;
				try {
					pd = new PockedexScreen(100, 100, 753, 549, 5, 5, 5, 5);
					pd.setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
//		Render an Exit button
		JButton btnExit = GUIBuilder.addButton("Exit\r\n", Color.BLACK, UIManager.getColor("Button.darkShadow"), 450, 450, 123, 30, window, null, Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				System.exit(0);
			}
		});
		
		JLabel backgroundImg = GUIBuilder.addLabel("", null, null, 0, 0, 600, 550, window, "Pokemon.jpg");

	}
}
