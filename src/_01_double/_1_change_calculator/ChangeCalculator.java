package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {
String pennies = JOptionPane.showInputDialog(null,"How many pennies do you have?");
		
int pennyNumber = Integer.parseInt(pennies);
		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int nickelNumber = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");

int dimeNumber = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");

int quartNumber = Integer.parseInt(quarters);
		// Calculate how much money the user has.  Hint: Use a double variable 
double pennyUSD = pennyNumber * 0.01;

double nickelUSD = nickelNumber * 0.05;

double dimeUSD = dimeNumber * 0.1;

double quarterUSD = quartNumber * 0.25;

double totalMoney = (pennyUSD + nickelUSD + dimeUSD + quarterUSD);

JOptionPane.showMessageDialog(null, "Your money is: " + totalMoney);

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

