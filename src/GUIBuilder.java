import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class GUIBuilder extends JPanel{

	public static void main(String[] args) {
		
		Tester.testFunction("addLabel()", addLabelTest());
		Tester.testFunction("addButton()", addButtonTest());
		Tester.testFunction("addScrollPane()", addScrollPaneTest());

	}
	
	public GUIBuilder(int x, int y, int width, int height, int borderTop, int borderLeft, int borderBottom, int borderRight) {
		this.setBackground(Color.DARK_GRAY);
		this.setBorder(new EmptyBorder(borderTop, borderLeft, borderBottom, borderRight));
		this.setLayout(null);	
	}
	
//	Create a new JLabel and add it to a JPanel
	public static JLabel addLabel(String caption, Color fontColor, Color backColor, int x, int y, int width, int height, JPanel contentPane, String imgPath) {
		JLabel tempLabel = new JLabel(caption);
		tempLabel.setForeground(fontColor);
		tempLabel.setBackground(backColor);
		
		if(imgPath!=null)
			tempLabel.setIcon(new ImageIcon(PockedexScreen.class.getResource(imgPath)));
		
		tempLabel.setBounds(x,y,width,height);
		contentPane.add(tempLabel);	
		return tempLabel;
	}
	
	public static ArrayList<String> addLabelTest() {
		ArrayList<String> errors = new ArrayList<String>(); 
		JPanel contentPane=new JPanel();
		JLabel tempLabel=addLabel("Test Caption", Color.BLUE, Color.RED, 10, 20, 30, 40, contentPane, "pokeball1.jpg");
		if(contentPane!=tempLabel.getParent())
			errors.add("Add to parent error");
		if(tempLabel.getText()!="Test Caption")
			errors.add("Set Text error");
		if(tempLabel.getForeground()!=Color.BLUE)
			errors.add("Set Foreground Color error");
		if(tempLabel.getBackground()!=Color.RED)
			errors.add("Set Background Color error");
		if(tempLabel.getX()!= 10)
			errors.add("Set X error");
		if(tempLabel.getY()!= 20)
			errors.add("Set Y error");
		if(tempLabel.getWidth() != 30)
			errors.add("Set Width error");
		if(tempLabel.getHeight() != 40)
			errors.add("Set Height error");
		
		String resultIcon=tempLabel.getIcon().toString();
		String expectedIcon=new ImageIcon(GUIBuilder.class.getResource("pokeball1.jpg")).toString();
		if(!resultIcon.equals(expectedIcon))
			errors.add("Set Icon error expected: "+expectedIcon+" but got "+resultIcon);
		return errors;
	}

//	Create a new JButton and add it to a JPanel
	public static JButton addButton(String caption, Color fontColor, Color backColor, int x, int y, int width, int height, JPanel contentPane, String imgPath, Cursor cursor) {
		JButton tempButton = new JButton(caption);
		tempButton.setForeground(fontColor);
		tempButton.setBackground(backColor);
		
		if(imgPath!=null)
			tempButton.setIcon(new ImageIcon(GUIBuilder.class.getResource(imgPath)));
		
		tempButton.setBounds(x,y,width,height);
		
		if(cursor!=null)
			tempButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(tempButton);	
		return tempButton;
	}
	
	public static ArrayList<String> addButtonTest() {
		ArrayList<String> errors = new ArrayList<String>(); 
		JPanel contentPane=new JPanel();
		JButton tempButton=addButton("Test Caption", Color.BLUE, Color.RED, 10, 20, 30, 40, contentPane, "pokeball1.jpg", Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		if(contentPane!=tempButton.getParent())
			errors.add("Add to parent error");
		if(tempButton.getText()!="Test Caption")
			errors.add("Set Text error");
		if(tempButton.getForeground()!=Color.BLUE)
			errors.add("Set Foreground Color error");
		if(tempButton.getBackground()!=Color.RED)
			errors.add("Set Background Color error");
		if(tempButton.getX()!= 10)
			errors.add("Set X error");
		if(tempButton.getY()!= 20)
			errors.add("Set Y error");
		if(tempButton.getWidth() != 30)
			errors.add("Set Width error");
		if(tempButton.getHeight() != 40)
			errors.add("Set Height error");
		
		String resultIcon=tempButton.getIcon().toString();
		String expectedIcon=new ImageIcon(GUIBuilder.class.getResource("pokeball1.jpg")).toString();
		if(!resultIcon.equals(expectedIcon))
			errors.add("Set Icon error expected: "+expectedIcon+" but got "+resultIcon);
		if(tempButton.getCursor()!=Cursor.getPredefinedCursor(Cursor.HAND_CURSOR))
			errors.add("Set Cursor error");
		return errors;
	}
	
//	Create a new JTable and add it to a JScrollPane
	public static JTable addTable(JScrollPane tableContainer, Object[][] data, String[] headers){
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
	public static JScrollPane addScrollPane( int x, int y, int width, int height, JPanel contentPane) {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(x,y,width,height);
		contentPane.add(scrollPane);
		return scrollPane;
	}
	
	public static ArrayList<String> addScrollPaneTest() {
		ArrayList<String> errors = new ArrayList<String>(); 
		JPanel contentPane=new JPanel();
		JScrollPane tempScrollPane=addScrollPane(10,20,30,40,contentPane);
		if(contentPane!=tempScrollPane.getParent())
			errors.add("Add to parent error");
		if(tempScrollPane.getX()!= 10)
			errors.add("Set X error");
		if(tempScrollPane.getY()!= 20)
			errors.add("Set Y error");
		if(tempScrollPane.getWidth() != 30)
			errors.add("Set Width error");
		if(tempScrollPane.getHeight() != 40)
			errors.add("Set Height error");
		return errors;
	}
	
}
