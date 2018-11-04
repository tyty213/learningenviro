package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Horse extends JFrame{

	private JLabel item1;
	
	public Horse() {
		
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence.");
		item1.setToolTipText("This is gonna show when you hover");
		add(item1);
		
	}
	
}
