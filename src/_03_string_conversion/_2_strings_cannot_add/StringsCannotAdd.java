package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {
	public static void main(String[] args) {

		// 1) Make a main method that includes all the steps below…. 

		
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
			String fourAsString= JOptionPane.showInputDialog("Enter the number four");
			String fiveAsString= JOptionPane.showInputDialog("Enter the number five");
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			String sixAsString= JOptionPane.showInputDialog("Enter the number six");

			4
			
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
			JOptionPane.showMessageDialog(null, fourAsString+fiveAsString+sixAsString);

			
			// Did you notice 46 instead of 4 + 6 = 10?
			
			
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			
			// 7) Do the same for sixAsString. 
			
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			
			// Is your value now 15 instead of 465?
	}
}
