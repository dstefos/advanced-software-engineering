import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class PockedexScreen extends JFrame {

	private JPanel contentPane;
	private JTable pokemonTable;

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
	public PockedexScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 549);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		JLabel pockedexIconLbl = new JLabel("Pokedex");
		pockedexIconLbl.setForeground(Color.WHITE);
		pockedexIconLbl.setIcon(new ImageIcon(PockedexScreen.class.getResource("pokeball1.jpg")));
		pockedexIconLbl.setBounds(10, 11, 100, 30);
		contentPane.add(pockedexIconLbl);	
		JButton btnSound = new JButton("Play Sound");
		btnSound.setForeground(Color.BLACK);
		btnSound.setBackground(Color.RED);
		btnSound.setBounds(393, 351, 107, 23);
		contentPane.add(btnSound);		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 65, 190, 309);
		contentPane.add(scrollPane);		
		pokemonTable = new JTable();
		pokemonTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Pikachu"},
				{"Charizard"},
				{"Jigglypuff"},
				{"Psyduck"},
				{"Gengar"},
				{"Alakazam"},
				{"Bulbasaur"},
				{"Onix"},
				{"Mankey"},
			},
			new String[] {
				"Pokemon"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		pokemonTable.getColumnModel().getColumn(0).setResizable(false);
		scrollPane.setViewportView(pokemonTable);
		
		JLabel pokemonIconLbl = new JLabel("");
		pokemonIconLbl.setBounds(393, 65, 221, 205);
		contentPane.add(pokemonIconLbl);		
		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setBounds(317, 281, 221, 94);
		contentPane.add(label);
		pokemonTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	            String PokemonName=pokemonTable.getValueAt(pokemonTable.getSelectedRow(), 0).toString();
	            // print first column value from selected row
	        	pokemonIconLbl.setIcon(new ImageIcon("Images/"+PokemonName+".jpg"));
	        }			
	    });
	}
}
