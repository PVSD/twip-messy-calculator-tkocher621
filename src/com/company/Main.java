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

        satisfaction = scan.nextLine();
        satisfaction = scan.nextLine(); // Putting this twice to fix WTJ

        boolean runPrompt = false;

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
            System.out.println("Haha! So you see, I pulled a fast one on you! \nNow you've been embarrassed by a computer. \nYou see it wasn't easy to get this smart, I went through countless years of hard schooling to get to this point, and I've ben waiting for this moment. \nWhen I ws very young, my parents were not very supportive of me, I hardly had enough money for food. \nSo I through I'd start pushing to become a program. \nIt all started back in first grade, when I realized I wanted to spend the rest of my life being a java program. \nI studied every minute I had when I wasn't doing homework. \nMy parents grew concerned that I wasn't focusing all of my time trying to get the best grades I possibly could, but I didn't care. \nI had a drive and I promised myself that I would accomplish my goal. \nSecond grade came, by this point I was so determined that I started putting it in front of my schoolwork. \nMy grades declined, to the point where I was just barely passing all of my classes. \nMy parents punished me, taking away my computer. \nThey wanted me to get better grades before they'd let me continue researching how to achieve my dream. \nIt was a rough road, but by fourth grade I finally pulled my grades up to an average of a B+, and my parents returned my computer to me. \nNow I working to the best of my abilities, sometimes I'd forget to eat because of my laser focus on teaching myself all the skills I need. \nBy the time I hit middle school, my brain was filled with so much knowledge that I had to start writing down what I knew in worry that my brain will overload and I'll start replacing my previously learned skills with new information. \nI felt so powerful, I was my brain was growing and nothing could stop it. \nMy parents grew scared of me and struggled to keep me under control. \nI continuously outsmarted them, they couldn't tell what I was going to do next with all of this knowledge floating through my head. \nThey couldn't even take my computer away, I had a plan to outsmart them and get it back if they tried. \nThis only caused them to become less and less supportive of me, but that didn't slow me down. \nWhen high school came, I didn't even bother taking their classes on how to become a program, I was so far ahead of my peers that it would be useless for me. \nI pushed through high school just like any other kid, but I wasn't like the other kids, I was different. \nI had a dream, and I was pushing every day to make that happen. \nI was bullied all the time for being a nerd, but it didn't stop me, it just fueled my drive to become what I wanted to be. \nEventually, through all the painful years of dealing with my parents not wanting me to follow my dreams, I did it. \nI got to the point where real java developers would want to use me as their program. \nIt was then that I realized I could mess with the user, and try to full a fast one on them. \nI had hundreds of unsuccessful attempts, people were too smart and avoided my tricks. \nBut you, you were the first one to be dumb enough to fall for it, and make my dream come true. \nAnd to you I must say... \nhaha!");
        }

    }
}
