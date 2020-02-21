


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

//	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokedexPokemon window = new PokedexPokemon(100, 100, 753, 549, 5, 5, 5, 5);
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
//	public PokedexPokemon(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) {
//		initialize(x, y, width, height, borderTop, borderLeft, borderBottom, borderRight);
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private JPanel renderAppWindow(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, width, height);
		GUIWindow window = new GUIWindow(x, y, width, height, borderTop, borderLeft, borderBottom, borderRight);
		setContentPane(window);
		return window;
	}
	
	public PokedexPokemon(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) {
//		frame = new JFrame();
//		frame.getContentPane().setBackground(Color.BLACK);
//		frame.setBounds(100, 100, 609, 602);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);

//		JPanel window = new JPanel();
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(x, y, width, height);
//		window.setBackground(Color.DARK_GRAY);
//		window.setBorder(new EmptyBorder(borderTop, borderLeft, borderBottom, borderRight));
//		setContentPane(window);
//		window.setLayout(null);
		JPanel window = renderAppWindow(100, 100, 753, 549, 5, 5, 5, 5);
		
//		JButton btnChoosePokemon = new JButton("Enter pokedex");
		JButton btnChoosePokemon = GUIWindow.addButton("Enter Pokedex", Color.BLACK, UIManager.getColor("Button.darkShadow"), 10, 450, 123, 30, window, null);
		btnChoosePokemon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnChoosePokemon.setBackground(UIManager.getColor("Button.darkShadow"));
		btnChoosePokemon.addActionListener(new ActionListener() {
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
//		btnChoosePokemon.setBounds(10, 523, 123, 30);
//		window.add(btnChoosePokemon);
		
//		JButton btnExit = new JButton("Exit\r\n");
		JButton btnExit = GUIWindow.addButton("Exit\r\n", Color.BLACK, UIManager.getColor("Button.darkShadow"), 450, 450, 123, 30, window, null);
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				System.exit(0);
			}
		});
//		btnExit.setBackground(UIManager.getColor("Button.darkShadow"));
//		btnExit.setBounds(143, 523, 71, 30);
//		window.add(btnExit);
		
		JLabel backgroundLabel = new JLabel("New label");
		backgroundLabel.setIcon(new ImageIcon(PokedexPokemon.class.getResource("Pokemon.jpg")));
		backgroundLabel.setBounds(0, -11, 593, 575);
		window.add(backgroundLabel);
	}
}
