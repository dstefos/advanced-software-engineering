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
					PockedexScreen frame = new PockedexScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JPanel renderAppWindow() {
		JPanel app = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 549);
		app.setBackground(Color.DARK_GRAY);
		app.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(app);
		app.setLayout(null);	
		return app;
	}
	
//	Create a new JLabel and add it to a JPanel
	private JLabel addLabel(String caption, Color fontColor, Color backColor, int x, int y, int width, int height, JPanel contentPanel, String imgPath) {
		JLabel tempLabel = new JLabel(caption);
		tempLabel.setForeground(fontColor);
		tempLabel.setBackground(backColor);
		
		if(imgPath!=null)
			tempLabel.setIcon(new ImageIcon(PockedexScreen.class.getResource(imgPath)));
		
		tempLabel.setBounds(x,y,width,height);
		contentPanel.add(tempLabel);	
		return tempLabel;
	}

//	Create a new JButton and add it to a JPanel
	private JButton addButton(String caption, Color fontColor, Color backColor, int x, int y, int width, int height, JPanel contentPanel, String imgPath) {
		JButton tempButton = new JButton(caption);
		tempButton.setForeground(fontColor);
		tempButton.setBackground(backColor);
		
		if(imgPath!=null)
			tempButton.setIcon(new ImageIcon(PockedexScreen.class.getResource(imgPath)));
		
		tempButton.setBounds(x,y,width,height);
		contentPanel.add(tempButton);	
		return tempButton;
	}
	
//	Create a new JTable and add it to a JScrollPane
	private JTable addTable(JScrollPane tableContainer, Object[][] data, String[] headers){
		JTable tempTable = new JTable();
		tempTable.setModel(new DefaultTableModel(
			data,
			headers
		) {
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		tempTable.getColumnModel().getColumn(0).setResizable(false);
		tableContainer.setViewportView(tempTable);
		return tempTable;
	}	
	
//  Create a new JScrollPane and add it to a JPanel
	private JScrollPane addScrollPane( int x, int y, int width, int height, JPanel app) {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(x,y,width,height);
		app.add(scrollPane);
		return scrollPane;
	}
	
	public PockedexScreen() throws IOException {
		
//		Render main window
		JPanel app = renderAppWindow();

//		Render Pokeball icon
		addLabel("Pokedex", Color.WHITE, null, 10, 11 ,100,30,app, "pokeball1.jpg");
		
//		Render Play Sound button
		JButton btnSound=addButton("Play Sound", Color.BLACK, Color.RED, 393,351,107,23,app, null);
		
//		A list containing the name sof the Pokemons 
		JScrollPane scrollPane = addScrollPane(56, 65, 190, 309, app);		
		Pokemon[] pokemonData= CSVParser.readData("pokemons.csv");
		Object[][] data=new Object[pokemonData.length][1];
		for(int i=0; i<pokemonData.length; i++) {
			Pokemon tempPokemon=pokemonData[i];
			data[i][0]=tempPokemon.getName();
		}
		String[] headers=new String[] {
				"Pokemon"
			};
		JTable pokemonTable=addTable(scrollPane,data, headers);
		
//		Pokemon's Avatar		
		JLabel pokemonIconLbl = addLabel("", null, null, 350, 65, 221 ,205, app, null);

//		Pokemon's name under Avatar
		JLabel label = addLabel("", Color.WHITE, null, 350, 281, 220, 210, app, null);
		
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
	}
}
