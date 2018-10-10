import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
        int num1 = 5;
        while (num1 != 102)
        {
            num1 = (int) (Math.random() * 100 + 1);
        }
        System.out.println(num1);
    }
}
