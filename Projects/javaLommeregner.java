/**
 * @author Simon "SnaBe" Sørensen
 */

//A shot at a Java calculator using Scanner and Keyboard input

import java.util.Scanner;

public class javaLommeregner 
{
    public static void main(String[] args) 
    {
        int firstNumber;
        int secondNumber;
        
        String operation;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your first number.");
        firstNumber = Keyboard.readInt();
        
        Scanner op = new Scanner(System.in);
        
        System.out.println("Please choose an operation.");
        operation = op.next();
        
        System.out.println("Please enter your second number.");
        secondNumber = Keyboard.readInt();
        
        switch (operation) {
            case "+":
                System.out.println("Your answer is: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Your answer is: " + (firstNumber - secondNumber));
                break;
            case "/":
                System.out.println("Your answer is: " + (firstNumber / secondNumber));
                break;
            case "*":
                System.out.println("Your answer is: " + (firstNumber * secondNumber));
                break;
            default:
                System.out.println("Wrong operation.");
                break;
        }
    }
    
}
