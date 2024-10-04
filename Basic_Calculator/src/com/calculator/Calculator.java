package com.calculator;
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        
        double firstnum, secondnum;
        boolean addmore = true;
        String symbol;
        
        while(addmore) {
            System.out.println("Welcome to my basic calculator using core Java");
            
            System.out.println("Enter first number:");
            firstnum = ref.nextDouble();
            
            System.out.println("Enter second number:");
            secondnum = ref.nextDouble();
            
            System.out.println("Enter any symbol (+, -, *, /):");
            symbol = ref.next();
           
            switch (symbol) {
                case "+":
                    System.out.println("Result: " + (firstnum + secondnum));
                    break;
                case "-":
                    System.out.println("Result: " + (firstnum - secondnum));
                    break;
                case "*":
                    System.out.println("Result: " + (firstnum * secondnum));
                    break;
                case "/":
                    if(secondnum != 0) {
                        System.out.println("Result: " + (firstnum / secondnum));
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid symbol. Please use +, -, *, or /.");
                    continue; // Skips the rest of the loop if the symbol is invalid
            }
            
            System.out.println("Do you want to continue? Enter 1 for Yes, 2 for No:");
            int userchoice = ref.nextInt();
            
            if(userchoice == 1) {
                addmore = true;
            } else if(userchoice == 2) {
                addmore = false;
                System.out.println("Thanks for using my calculator.");
            } else {
                System.out.println("Invalid choice, exiting.");
                addmore = false;
            }
        }
        ref.close();
    }
}
