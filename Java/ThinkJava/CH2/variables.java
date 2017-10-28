public class variables
{
    public static void main(String[] args)
    {
    int hour;
    double minute = 59.0;
    hour = 11; // assign the value 11 to hour
    minute = 59; // set minute to 59
    String firstLine = "Hello, again!";
    System.out.println(firstLine);
    System.out.print("The value of firstLine is ");
    System.out.println(firstLine);
    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");
    System.out.print("Number of minutes since midnight: ");
    System.out.println(hour*60 + minute);
    System.out.print("Fraction of the hour that has passes: ");
    System.out.println(minute/60.0);
    System.out.print("Percent of the hour that has passes: ");
    System.out.println(minute * 100/60);
    System.out.println(0.1 * 10);
    System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
    System.out.println(1 + 2 + "Hello");
    System.out.println("Hello" + 1 + 2);
    }
}