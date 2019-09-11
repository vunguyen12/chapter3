package assignments;

import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        double x = 2.0;
        double y = 5.0;

//
        computerPercentages(x, y);
        computerPercentages2(y, x);

//        computerPercentages 1
    }

    public static void computerPercentages(double x, double y) {
        double x1;
        double y1;

        x1 = x / y * 100;
        System.out.println(x + " is " + x1 + " percent of " + y);
    }

    //        computerPercentages 2

    public static void computerPercentages2(double x2, double y2) {
        Scanner input = new Scanner(System.in);
        double s;
        System.out.println("please enter a decimal number");

        x2 = input.nextDouble();

        System.out.println("please enter your next decimal number");

        y2 = input.nextDouble();

        s = x2 / y2 * 100;
        System.out.println(x2 + " is " + s + " percent of " + y2);

    }
}
