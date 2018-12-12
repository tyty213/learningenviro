package moreGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI extends JFrame {

	private JButton reg;
	private JButton custom;
	
	public GUI() {
		
		super("The title");
		setLayout(new FlowLayout());
		
		reg = new JButton("reg button");
		add(reg);
		
		Icon a = new ImageIcon(getClass().getResource("a.png"));
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		
		custom = new JButton("Custom", a);
		custom.setRolloverIcon(b);
		add(custom);
		
		HandlerClass handlerOBJ = new HandlerClass();
		reg.addActionListener(handlerOBJ);
		custom.addActionListener(handlerOBJ);
		
	}
	
	private class HandlerClass implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, String.format("%s", e.getActionCommand()));
		}
		
	}
	
}
