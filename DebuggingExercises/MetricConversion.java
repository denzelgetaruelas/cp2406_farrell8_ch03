import java.util.Scanner;
/**
 * Created by Jc337839 on 21/08/17.
 */
public class MetricConversion
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        InchesToCentimeters(number);
        GallonsToLiters(number);
    }
    public static void InchesToCentimeters(double number)
    {
        double centimeters = number * 2.54;
        System.out.println(number + " inches is equal to "  + String.format("%.2f", centimeters) + " centimeters" );
    }
    public static void GallonsToLiters(double number)
    {
        double liters = number * 3.7854;
        System.out.println(number + " gallons is equal to "  + String.format("%.2f", liters) + " liters");
    }
}
