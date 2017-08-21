/**
 * Created by Jc337839 on 18/08/17.
 */
public class NumbersDemo
{
    public static void main(String[] args)
    {
        int a, b;
        a = 6;
        b = 9;
        displayTwiceTheNumber(a, b);
        displayNumberPlusFive(a, b);
        displayNumberSquared(a, b);
    }
    private static void displayTwiceTheNumber(int number, int number2)
    {
        System.out.println("Twice of First Number: " + (number*2));
        System.out.println("Twice of Second Number: " + (number2*2));
    }
    private static void displayNumberPlusFive(int number, int number2)
    {
        System.out.println("First Number plus five: " + (number + 5));
        System.out.println("Second Number plus five: " + (number2 + 5));
    }
    private static void displayNumberSquared(int number, int number2)
    {
        System.out.println("First Number squared: " + (number*number));
        System.out.println("Second Number squared: " + (number2*number2));
    }
}

