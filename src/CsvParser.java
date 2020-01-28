import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvParser {
	
	private String file;
	
	public CsvParser(String tempFileName) {
		file=tempFileName;
	}
	
	public ArrayList<String[]> readData() throws IOException { 
	    int count = 0;
	    ArrayList<String[]> content = new ArrayList<>();
	    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            content.add(line.split(","));
	        }
	    } catch (FileNotFoundException e) {
	    	System.out.println(file+" not found!");
	    }
	    return content;
	}
	
	public static void main(String[] args) throws IOException {
		CsvParser parser= new CsvParser("test.csv");
		ArrayList<String[]> lista=parser.readData();
		for(String[] line: lista) {
			for(String text: line)
				System.out.println(text);
		}
	}
}
