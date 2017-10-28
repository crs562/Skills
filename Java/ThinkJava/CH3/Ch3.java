import java.util.Scanner;

public class Ch3
{
    public static void main(String[] args)
    {
        System.out.println(System.out);
        Scanner in = new Scanner(System.in);
        System.out.print(4.0/3.0);
        System.out.printf("Four thirds = %.3f", 4.0/3.0);
        String name;
        double age1 = 25.5, age2 = 25.0;
        System.out.printf("%f %f", age1);
//        System.out.print("What is your name? ");
//        name = in.nextLine();
//        System.out.print("What is your age? ");
//        age = in.nextInt();
//        System.out.printf("Hello %s, age %d\n", name, age);
//        System.out.print("What is your age? ");
//        age = in.nextInt();
//        in.nextLine(); // read the newline
//        System.out.print("What is your name? ");
//        name = in.nextLine();
//        System.out.printf("Hello %s, age %d\n", name, age);
        in.close();
    }
}
