package assignments;

import java.util.Scanner;

public class poundConversion {
    public static void main(String[] args){
        double userEntry1;

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        userEntry1 = input.nextInt();


        lbstoKilo(userEntry1);
        lbsOunces(userEntry1);
        lbsMilligram(userEntry1);
    }
    public static void lbstoKilo(double input1){
        double kiloGram = input1 / 2.205;
        System.out.println(input1 +" pounds is "+kiloGram +" kilogram");
    }
    public static void lbsOunces(double input1){
        double ounce = input1 * 16;
        System.out.println(input1 + " pounds is " + ounce +" ounces");

    }
    public static void lbsMilligram(double input1) {
        double milligram = input1 * 453592;
        System.out.println(input1 + " pounds is " + milligram + " milligram");
        
    }



}
