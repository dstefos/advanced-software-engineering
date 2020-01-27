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
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class PockedexScreen extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		setBounds(100, 100, 673, 577);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pokedex");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(PockedexScreen.class.getResource("pokeball1.jpg")));
		lblNewLabel.setBounds(10, 11, 100, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Play Sound");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(406, 400, 134, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Pokemon");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(58, 400, 188, 23);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 65, 190, 309);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Pikachu"},
				{"Charizard"},
				{"Jigglypuff"},
				{"Psyduck"},
				{"Gengar"},
				{"Ekans"},
				{"Alakazam"},
				{"Bulbasaur"},
				{"Onix"},
				{"Mankey"},
			},
			new String[] {
				"Pokemon"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		scrollPane.setViewportView(table);
	}
}
