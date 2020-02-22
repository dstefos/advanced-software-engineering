import java.awt.Color;
import java.awt.Cursor;

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
		// TODO Auto-generated method stub

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

//	Create a new JButton and add it to a JPanel
	public static JButton addButton(String caption, Color fontColor, Color backColor, int x, int y, int width, int height, JPanel contentPane, String imgPath, Cursor cursor) {
		JButton tempButton = new JButton(caption);
		tempButton.setForeground(fontColor);
		tempButton.setBackground(backColor);
		
		if(imgPath!=null)
			tempButton.setIcon(new ImageIcon(PockedexScreen.class.getResource(imgPath)));
		
		tempButton.setBounds(x,y,width,height);
		
		if(cursor!=null)
			tempButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(tempButton);	
		return tempButton;
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
	
}
