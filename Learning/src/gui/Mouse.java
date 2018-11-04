package gui;

import javax.swing.JOptionPane;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fNum = JOptionPane.showInputDialog("Enter First Number");
		String sNum = JOptionPane.showInputDialog("Enter Second Number");
		
		int num1 = Integer.parseInt(fNum);
		int num2 = Integer.parseInt(sNum);
		
		int sum = num1+num2;
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Answer", JOptionPane.PLAIN_MESSAGE);
		
	}

}
