//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class fatcrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String answer = JOptionPane.showInputDialog("who do you hate in this world?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+ answer);
		// 3. Ask the user for the name of their best friend
String answer2 = JOptionPane.showInputDialog("what is your best friends name");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, answer2+ "is as sweet as diabeetes");

	} 
}



