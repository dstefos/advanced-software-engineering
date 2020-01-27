import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class PockedexScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PockedexScreen frame = new PockedexScreen();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PockedexScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setForeground(Color.WHITE);
		list.setBackground(Color.RED);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Buldasaur", "Charizard", "Pikachu", "Alakazam", "Ekans", "Gengar", "Jigglypuff", "Psyduck", "Onix", "Mankey"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(58, 35, 150, 166);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PockedexScreen.class.getResource("pokeball1.jpg")));
		lblNewLabel.setBounds(10, 11, 71, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Play Sound");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(261, 211, 134, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Pokemon");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(58, 211, 150, 23);
		contentPane.add(btnNewButton_1);
	}
}
