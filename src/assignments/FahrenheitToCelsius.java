package assignments;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        double temperture;
        Scanner input= new Scanner(System.in);

        System.out.println("what is the temp at 8 am");
        temperture = input.nextDouble();

        convert(temperture);

    }
    public static void convert(double temperture){
        double F;
        F = (temperture*9/5)+32;
        System.out.println("the temp at 8 am is " + F + " fahrenheit\n");


            if (50>F){
                System.out.println(" the temperture is below 32F, it's freesing outside");

        }
else if (100<F){
                System.out.println(" the temperture is above 100F, it's hot outside");
            }

    }

}
