package example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int userEntry1;
        int userEntry2;

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        userEntry1 = input.nextInt();
        System.out.println("Enter a number");
        userEntry2 = input.nextInt();
        calculateAddition(userEntry1, userEntry2, " + ");
        calculateSubtraction(userEntry1, userEntry2, "- ");
        calculatemodulus(userEntry1, userEntry2);
        calculateMutiplication(userEntry1, userEntry2);
        calculateDivision(userEntry1, userEntry2);

    }

    public static void calculateAddition(int num1, int num2, String sign) {
        int total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);
    }

    public static void calculateSubtraction(int num1, int num2, String sign) {
        int total = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + total);
    }

    public static void calculatemodulus(int num1, int num2) {
        int total = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + total);
    }

    public static void calculateMutiplication(int num1, int num2) {
        int total = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + total);
    }

    public static void calculateDivision(int num1, int num2) {
        int total = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + total);
    }
}