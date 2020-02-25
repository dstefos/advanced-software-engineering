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

	public static int test() {
		
		int failedTestsCount=0;

		System.out.println("Testing addLabel:");
		failedTestsCount+=Tester.testFunction("addLabel", addLabelTest());
		
		System.out.println("Testing addButton");
		failedTestsCount+=Tester.testFunction("addButton", addButtonTest());
		
		System.out.println("Testing addTable");
		failedTestsCount+=Tester.testFunction("addTable",addTableTest());
		
		System.out.println("Testing addScrollPane:");
		failedTestsCount+=Tester.testFunction("addScrollPane", addScrollPaneTest());
		
		System.out.println("Failed: "+failedTestsCount);

		System.out.println();
		return failedTestsCount;

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
	
	public static int addLabelTest() {
		int errors = 0; 
		JPanel contentPane=new JPanel();
		JLabel tempLabel=addLabel("Test Caption", Color.BLUE, Color.RED, 10, 20, 30, 40, contentPane, "pokeball1.jpg");
		errors+=Tester.compare("Class", tempLabel.getClass(), new JLabel().getClass());
			
		Object expectedClass=new JLabel().getClass();
		Object gotClass=tempLabel.getClass();
		errors+=Tester.compare("Class", expectedClass, gotClass);
			
		errors+=Tester.compare("Add to parent", contentPane, tempLabel.getParent());
			
		errors+=Tester.compare("Set Text", "Test Caption", tempLabel.getText());
			
		errors+=Tester.compare("Set Foreground", Color.BLUE, tempLabel.getForeground());
			
		errors+=Tester.compare("Set Background", Color.RED, tempLabel.getBackground());
			
		errors+=Tester.compare("Set X", 10, tempLabel.getX());
			
		errors+=Tester.compare("Set Y", 20, tempLabel.getY());
			
		errors+=Tester.compare("Set Width", 30, tempLabel.getWidth());
			
		errors+=Tester.compare("Set Height", 40, tempLabel.getHeight());
			
		
		String resultIcon=tempLabel.getIcon().toString();
		String expectedIcon=new ImageIcon(GUIBuilder.class.getResource("pokeball1.jpg")).toString();
		errors+=Tester.compare("Set Icon", expectedIcon, resultIcon);
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
	
	public static int addButtonTest() {
		int errors = 0; 
		JPanel contentPane=new JPanel();
		JButton tempButton=addButton("Test Caption", Color.BLUE, Color.RED, 10, 20, 30, 40, contentPane, "pokeball1.jpg", Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Object expectedClass=new JButton().getClass();
		Object gotClass=tempButton.getClass();
		errors+=Tester.compare("Class", expectedClass, gotClass);
			
		errors+=Tester.compare("Add to parent", contentPane, tempButton.getParent());
			
		errors+=Tester.compare("Set Text", "Test Caption", tempButton.getText());
			
		errors+=Tester.compare("Set Foreground", Color.BLUE, tempButton.getForeground());
			
		errors+=Tester.compare("Set Background", Color.RED, tempButton.getBackground());
			
		errors+=Tester.compare("Set X", 10, tempButton.getX());
			
		errors+=Tester.compare("Set Y", 20, tempButton.getY());
			
		errors+=Tester.compare("Set Width", 30, tempButton.getWidth());
			
		errors+=Tester.compare("Set Height", 40, tempButton.getHeight());
			
		
		String resultIcon=tempButton.getIcon().toString();
		String expectedIcon=new ImageIcon(GUIBuilder.class.getResource("pokeball1.jpg")).toString();
		errors+=Tester.compare("Set Icon", expectedIcon, resultIcon);
		errors+=Tester.compare("Set Cursor", tempButton.getCursor(), Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

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
	
	public static int addTableTest() {
		int errors = 0; 
		JScrollPane tableContainer=new JScrollPane();
		String[] headers= {
				"First",
				"Second"
		};
		Object[][] data= {
				{"FirstFirst", "FirstSecond"},
				{"SecondFirst", "SecondSecond"}
		};
		JTable tempTable=addTable(tableContainer, data, headers);
		Object expectedClass=new JTable().getClass();
		Object gotClass=tempTable.getClass();
		errors+=Tester.compare("Class", expectedClass, gotClass);

		errors+=Tester.compare("Add to parent", tableContainer, tempTable.getParent().getParent());

		errors+=Tester.compare("Table data", Arrays.deepEquals(getTableData(tempTable), data), true);
		
		errors+=Tester.compare("First column resizable", tempTable.getColumnModel().getColumn(0).getResizable(), false);
		
		return errors;
	}
	
	private static Object[][] getTableData (JTable table) {
	    DefaultTableModel dtm = (DefaultTableModel) table.getModel();
	    int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
	    Object[][] tableData = new Object[nRow][nCol];
	    for (int i = 0 ; i < nRow ; i++)
	        for (int j = 0 ; j < nCol ; j++)
	            tableData[i][j] = dtm.getValueAt(i,j);
	    return tableData;
	}
	
	
//  Create a new JScrollPane and add it to a JPanel
	public static JScrollPane addScrollPane( int x, int y, int width, int height, JPanel contentPane) {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(x,y,width,height);
		contentPane.add(scrollPane);
		return scrollPane;
	}
	
	public static int addScrollPaneTest() {
		int errors=0;
		JPanel contentPane=new JPanel();
		JScrollPane tempScrollPane=addScrollPane(10,20,30,40,contentPane);
		errors+=Tester.compare("Add to parent", contentPane, tempScrollPane.getParent());
			
		errors+=Tester.compare("Set X", 10, tempScrollPane.getX());
			
		errors+=Tester.compare("Set Y", 20, tempScrollPane.getY());
			
		errors+=Tester.compare("Set Width", 30, tempScrollPane.getWidth());
			
		errors+=Tester.compare("Set Height", 40, tempScrollPane.getHeight());
			
		return errors;
	}
	
}
