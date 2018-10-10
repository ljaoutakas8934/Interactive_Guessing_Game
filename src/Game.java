import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
        int num1 = (int) (Math.random() * 100 + 1);
        Scanner input = new Scanner(System.in);
        int guess = 101;
        System.out.println("Guess the number:");
        System.out.println("it is "+num1);
        while (guess != num1)
        {
            guess = input.nextInt();
            if (guess != num1)
            {
                System.out.println("Guess again");
            }
        }
        System.out.println("You got it!");
    }
    public static int ai(String value)
    {
        int a = 50;

        while (int)
        {
            if (value.equals("The number is lower than you guessed"))
            {

            }
            else
            {

            }
        }
        return a;
    }
}
