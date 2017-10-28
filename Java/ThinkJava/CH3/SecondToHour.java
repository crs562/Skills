// Exercise 3.3 Solution

import java.util.Scanner;

public class SecondToHour
{
    public static void main(String[] args)
    {
        int second, hours, minutes, seconds;
        final int HR_TO_SEC = 3600, MIN_TO_SEC = 60;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Seconds: ");
        second = in.nextInt();
        hours = (int) (second / HR_TO_SEC);
        minutes = (int) ((second - (hours*HR_TO_SEC)) / MIN_TO_SEC);
        seconds = second - (hours*HR_TO_SEC) - (minutes*MIN_TO_SEC);
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", second, hours, minutes, seconds);
        in.close();
    }
}
