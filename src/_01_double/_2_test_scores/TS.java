package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TS {
	public static void main(String [] args) {
		
		String testScore = JOptionPane.showInputDialog(null, "What is your test score?");
		
		double scoreNumber = Double.parseDouble(testScore);
		
		if (scoreNumber >= 80) {
			JOptionPane.showMessageDialog(null, "You must have studied hard!");
				
		}
		else {
			JOptionPane.showMessageDialog(null, "You'll get over it.");
		}
		
	}
	
}
