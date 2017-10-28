import java.util.Random;
import java.util.Scanner;

public class GuessStarter
{
    public static void main(String[] args)
    {
        // pick a random number
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int number = in.nextInt();
        System.out.printf("Your guess is: %d\n", number);
        int guess = random.nextInt(100) + 1;
        System.out.printf("The number I was thinking of is: %d\n", guess);
        int off_number = number - guess;
        System.out.printf("You were off by: %d\n", off_number);
        in.close();
    }
}
