/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilo;
import java.util.Scanner;

/**
 *
 * @author schak
 */
public class HiLo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner num = new Scanner(System.in);
        //create  a random number
        int randNumber =(int)(Math.random()*200-100);
   
        int guess = 0;
        int noOfTries =0;
        while (guess !=randNumber){
             System.out.println("Guess a number between 1 and 100");
        guess = num.nextInt();
        noOfTries= noOfTries+1;
        System.out.println("You entered " + guess + ".");
        if (guess < randNumber)
            System.out.println(guess + " is wrong.Try again.");
        else if (guess >randNumber)
            System.out.println(guess + " is wrong. Try again.");
        else
            System.out.println("You win. It took "+noOfTries+" to finish" );
        
            

        }
       
       
      
    }
    
}
