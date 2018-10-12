import java.util.Scanner;
public class Game
{

    public static void main(String [] args)
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Which game do you want to play?");
        System.out.println("Press ''1'' to make the computer guess, ''2'' if you want to guess.");
        int ui1 = input1.nextInt();
        if (ui1 == 1)
        {
            aigame();
        }
        if (ui1 == 2)
        {
            guessgame();
        }
    }
    public static void aigame()
    {
        Scanner input3 = new Scanner (System.in);
        System.out.println("Think of a number from 1 to 1000");
        int lowerlim = 0;
        int upperlim = 1000;
        int guess = 500;
        int numguess = 1;
        String useri = "";
        while (true)
        {
            System.out.println("Is your number greater than, (type: 'g') less than, (type: 'l') or equal to ('type: e') the number " + guess + "?");
            //make a variable and set it to next line, and check that.
            useri = input3.nextLine();
            if (useri.equals("g"))
            {
               lowerlim = guess;
               guess = (int)(((upperlim-lowerlim)/2)+lowerlim);
            }
            if (useri.equals("l"))
            {
                upperlim = guess;
                guess = (int)(((upperlim-lowerlim)/2)+lowerlim);
            }
            if (useri.equals("e"))
            {
                break;
            }
            numguess++;
        }
        String plural = " try!";
        if (numguess >1)
        {
            plural = " tries!";
        }
        System.out.println("Great! The computer got it in "+numguess+plural);

    }
    public static void guessgame()
    {
        Scanner input2 = new Scanner(System.in);
        int num1 = (int) (Math.random() * 100 + 1);
        int guess = 101;
        int numguess = 1;
        String guesses = "";
        System.out.println("Guess the number:");
        // System.out.println("it is "+num1);
        while (guess != num1)
        {
            guess = input2.nextInt();
            if (guess != num1)
            {
                numguess++;
                System.out.println("Guess again");
            }
            guesses = guesses + " " + Integer.toString(guess);
        }
        String plural = " try!";
        if (numguess >1)
        {
            plural = " tries!";
        }
        System.out.println("You got it in " + numguess + plural);
        System.out.println("These were your guesses: " + guesses );
    }
}
