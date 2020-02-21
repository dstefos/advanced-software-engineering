import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;

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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PockedexScreen frame = new PockedexScreen(100, 100, 753, 549, 5, 5, 5, 5);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
//	public static void show(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	private JPanel renderAppWindow(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, width, height);
		GUIWindow window = new GUIWindow(x, y, width, height, borderTop, borderLeft, borderBottom, borderRight);
		setContentPane(window);
		return window;
	}
	

	public PockedexScreen(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) throws IOException {
		
//		Render main window
		JPanel app = renderAppWindow(100, 100, 753, 549, 5, 5, 5, 5);

//		Render Pokeball icon
		GUIWindow.addLabel("Pokedex", Color.WHITE, null, 10, 11 ,100,30,app, "pokeball1.jpg");
		
//		Render Play Sound button
		JButton btnSound=GUIWindow.addButton("Play Sound", Color.BLACK, Color.RED, 593,351,107,23,app, null);
		
//		A list containing the name sof the Pokemons 
		JScrollPane scrollPane = GUIWindow.addScrollPane(56, 65, 190, 309, app);		
		Pokemon[] pokemonData= CSVParser.readData("pokemons.csv");
		Object[][] data=new Object[pokemonData.length][1];
		for(int i=0; i<pokemonData.length; i++) {
			Pokemon tempPokemon=pokemonData[i];
			data[i][0]=tempPokemon.getName();
		}
		String[] headers=new String[] {
				"Pokemon"
			};
		JTable pokemonTable=GUIWindow.addTable(scrollPane,data, headers);
		
//		Pokemon's Avatar		
		JLabel pokemonIconLbl = GUIWindow.addLabel("", null, null, 350, 65, 221 ,205, app, null);

//		Pokemon's name under Avatar
		JLabel label = GUIWindow.addLabel("", Color.WHITE, null, 350, 281, 220, 210, app, null);
		
//		Listen clicks on the table and load the corresponding image
		pokemonTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
	        public void valueChanged(ListSelectionEvent event) {
	        	Pokemon selectedPokemon=pokemonData[pokemonTable.getSelectedRow()];
	            
//	            Render Pokemon's avatar
	            pokemonIconLbl.setIcon(new ImageIcon("Images/"+selectedPokemon.getName()+".jpg"));

//	        	Print Pokemon's data
	        	label.setText(selectedPokemon.toString());
	        }			
	    });
		
//		Select the first Pokemon
		pokemonTable.setRowSelectionInterval(0, 0);
	}
}
