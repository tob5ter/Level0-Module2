//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		if (randomNumber==4) {
			JOptionPane.showMessageDialog(null,"You're Pretty....Ugly");
			
		} else if (randomNumber==3) {
				JOptionPane.showMessageDialog(null,"Nice Job....At Failing");
			

				
			}
			else if (randomNumber==2) {
				JOptionPane.showMessageDialog(null,"Roses are Red, Violets are Blue, God Made Me Handsome, Guess He Forgot About You!");
			}
			else if (randomNumber==1) {
				JOptionPane.showMessageDialog(null,"You're Short");


			}
			
		}

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}

