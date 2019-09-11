package assignments;

import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args){
        double inches;
        double gallons;

        Scanner input = new Scanner(System.in);
        System.out.println("please enter inches");
        inches = input.nextDouble();
        System.out.println("please enter gallons");
        gallons= input.nextDouble();

        inchesToCenti(inches,gallons);
        gallonToLiter(gallons);
    }
    public static void inchesToCenti (double inches, double gallons) {
        double centimeter;

        centimeter = inches * 2.54;

        System.out.println("you put "+inches+" inches to centimeter is " + centimeter);
    }
    public static void gallonToLiter ( double gallons) {
        double liter;

        liter = gallons * 3.785;

        System.out.println("you put "+gallons+" gallons to liter is " + liter);

    }
}
