import java.util.Scanner;
/**
 * Created by Jc337839 on 21/08/17.
 */
public class Percentages2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.print("First number: ");
        a = scanner.nextDouble();
        System.out.print("Second number: ");
        b = scanner.nextDouble();

        computePercent(a, b);
        computePercent(b, a);
    }
    public static void computePercent(double number1, double number2)
    {
        double percent = (number1 / number2) * 100;
        System.out.println(number1 + " is " + String.format("%.0f", percent) + " percent of " + number2);
    }
}
