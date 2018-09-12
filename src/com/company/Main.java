package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        double num1 = 0, num2 = 0;
        String op;

        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to add, subtract, multiple, or divide?");
        op = scan.nextLine();

        String buff = null;

        switch (op.toLowerCase())
        {
            case "add":
                buff = "sum";
                break;
            case "subtract":
                buff = "difference";
                break;
            case "multiply":
                buff = "product";
                break;
            case "divide":
                buff = "quotient";
                break;
            default:
                System.out.println("Invalid expression");
        }

        System.out.println("Enter your first number");
        try {
            num1 = scan.nextInt();
        } catch (Exception ex)
        {
            System.out.println("Error: Input was not an integer.");
        }

        System.out.println("Enter your second number");
        try {
            num2 = scan.nextInt();
        } catch (Exception ex)
        {
            System.out.println("Error: Input was not an integer.");
        }

        String satisfaction;
        System.out.println("The " + buff + " of your two numbers is " + (Math.sqrt(num1 + num2)) + ". Are you satisfied?");

        satisfaction = scan.nextLine(); // FIX ME
        satisfaction = scan.nextLine(); // Putting this twice to fix WTJ

        boolean runPrompt;

        switch (satisfaction.toLowerCase())
        {
            case "yes":
                runPrompt = false;
                break;
            case "no":
                runPrompt = true;
                break;
        }

        if (runPrompt)
        {
            String ans;
            System.out.println("Can you identify what math class method I ran the real answer through?");
            ans = scan.nextLine();

            if (ans.toLowerCase().equals("sqrt"))
            {
                System.out.println("Ahh, you got me. Now go away, I'm annoyed that I lost.");
            }
            else
            {
                System.out.println("Haha wrong, I used sqrt");
            }
        }
        else
        {
            System.out.println("Haha! So you see, I pulled a fast one on you! Now you've been embarrassed from a computer.");
        }

    }
}
