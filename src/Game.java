import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
        int num1 = (int) (Math.random() * 100 + 1);
        Scanner input = new Scanner(System.in);
        int guess = 101;
        while (guess != num1)
        {
            guess = input.nextInt();
            System.out.print("Guess again");
        }
        System.out.println("You got it!");

    }
}
