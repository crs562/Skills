// Exercise 2.3

public class Time // class
{
    public static void main(String[] args) // method
    {
        int hour = 14, minute = 40, second = 20;
        System.out.print("Total number of seconds from midnight: ");
        int total_second;
        total_second = hour*3600 + minute*60 + second;
        System.out.println(total_second);
        System.out.print("Total number of seconds remaining in the day: ");
        System.out.println(24*3600 - total_second);
        System.out.print("Percentage of the day that has passed: ");
        System.out.println(total_second*100.0/(24.0*3600.0));
   }
}
