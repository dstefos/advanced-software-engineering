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

	}
	
//	Render window
	private JPanel renderAppWindow(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, width, height);
		GUIBuilder window = new GUIBuilder(x, y, width, height, borderTop, borderLeft, borderBottom, borderRight);
		setContentPane(window);
		return window;
	}
	

	public PockedexScreen(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight, Pokemon[] pokemonData) throws IOException {
		
//		Render window
		JPanel app = renderAppWindow(x, y, width, height, borderTop, borderLeft, borderBottom, borderRight);

//		Render Pokeball icon
		GUIBuilder.addLabel("Pokedex", Color.WHITE, null, 10, 11 ,100,30,app, "pokeball1.jpg");
		
//		A list containing the names of the Pokemons 
		JScrollPane scrollPane = GUIBuilder.addScrollPane(56, 65, 190, 309, app);	
		Object[][] data=new Object[pokemonData.length][1];
		for(int i=0; i<pokemonData.length; i++) {
			Pokemon tempPokemon=pokemonData[i];
			data[i][0]=tempPokemon.getName();
		}
		String[] headers=new String[] {
				"Pokemon"
			};
		JTable pokemonTable=GUIBuilder.addTable(scrollPane,data, headers);
		
//		Pokemon's Avatar		
		JLabel pokemonIconLbl = GUIBuilder.addLabel("", null, null, 350, 65, 221 ,205, app, null);

//		Pokemon's name under Avatar
		JLabel label = GUIBuilder.addLabel("", Color.WHITE, null, 350, 281, 220, 210, app, null);
		
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
