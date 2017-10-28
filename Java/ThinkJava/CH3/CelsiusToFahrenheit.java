import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        double celsius, fahrenheit;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        celsius = in.nextDouble();
        fahrenheit = (celsius * (9 / 5)) + 32;
        System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
        in.close();
    }
}
