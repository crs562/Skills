import java.util.Scanner;

public class ch4
{
    public static void main(String[] args)
    {
        double root = Math.sqrt(17.0);
        double angle = 1.5;
        double height = Math.sin(angle);
        double degrees = 90;
        double angle1 = degrees / 180.0 * Math.PI;
        double radians = Math.toRadians(180.0);
        double degrees1 = Math.toDegrees(Math.PI);
        long x = Math.round(Math.PI * 20.0);
        double x1 = Math.cos(angle + Math.PI / 2.0);
        double x2 = Math.exp(Math.log(10.0));
        double x3 = Math.pow(2.0, 10.0);
        int hour = 11;
        int minute = 59;
        printTime(hour, minute);
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input);
    }
    
    public static void printTime(int hour, int minute)
    {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }
}