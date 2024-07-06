package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {


public static void main(String[] args) {
    String message = "";
    Random ran=new Random();
    for(int i=0;i<6; i+=1){
    int randomChoice=1+ran.nextInt(99);
    message+=randomChoice+" ";
    }
    JOptionPane.showMessageDialog(null,message);
}
}