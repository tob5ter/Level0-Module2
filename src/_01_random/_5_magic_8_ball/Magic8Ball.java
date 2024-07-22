//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

import _01_random._3_dice_roll.DiceRoll;

public class Magic8Ball {
	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
		new DiceRoll().run();
	

	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog("Enter a Yes/No question here for me to answer");
	

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(4);

	
	// 4. If the random number is 0
		if (randomNumber==4) {
			JOptionPane.showMessageDialog(null,"Yes");
			
			} 
			else if (randomNumber==3) {
				JOptionPane.showMessageDialog(null,"No");
			

				
			}
			else if (randomNumber==2) {
				JOptionPane.showMessageDialog(null,"Maybe... No");
			}
			else if (randomNumber==1) {
				JOptionPane.showMessageDialog(null,"Possibly");
            }
			else if (randomNumber==0) {
				JOptionPane.showMessageDialog(null,"Definetely");


			}
			System.out.println(randomNumber);
			
		}
	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
