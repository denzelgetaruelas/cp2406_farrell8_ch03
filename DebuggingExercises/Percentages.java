/**
 * Created by Jc337839 on 21/08/17.
 */
public class Percentages
{
    public static void main(String[] args)
    {
        double a, b;
        a = 2.0;
        b = 5.0;

        computePercent(a, b);
        computePercent(b, a);
    }
    public static void computePercent(double number1, double number2)
    {
        double percent = (number1 / number2) * 100;
        System.out.println(number1 + " is " + String.format("%.0f", percent) + " percent of " + number2);
    }
}
