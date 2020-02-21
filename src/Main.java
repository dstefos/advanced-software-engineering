import java.awt.EventQueue;
import java.io.IOException;

public class Main
{

	public static void main(String[] args) throws IOException
	{   
		showWelcomeScreen();
	}
	
	public static void showPokedexScreen() throws IOException {
		Pokemon[] pokemonData= CSVParser.readData("pokemons.csv");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PockedexScreen frame = new PockedexScreen(100, 100, 750, 550, 5, 5, 5, 5, pokemonData);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void showWelcomeScreen() throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen window = new WelcomeScreen(100, 100, 600, 550, 5, 5, 5, 5);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}