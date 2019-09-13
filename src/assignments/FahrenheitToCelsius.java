package assignments;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        double temp8;
        double temp12;
        double temp5;
        Scanner input= new Scanner(System.in);

        System.out.println("what is the temp at 8 am");
        temp8 = input.nextDouble();
        System.out.println("what is the temp at 12 pm");
        temp12 =input.nextDouble();
        System.out.println("what is the temp at 5pm");
        temp5 = input.nextDouble();
        convert(temp8,temp12,temp5);

    }
    public static void convert(double temp8, double temp12,double temp5){
        double F;
        double F2;
        double F3;
        F = (temp8*9/5)+32;
        F2 = (temp12*9/5)+32;
        F3= (temp5 * 9/5)+12;
        System.out.println("the temp at 8 am is " + F + " fahrenheit\n");
        System.out.println("the temp at 12 am is " + F2 + " fahrenheit\n");
        System.out.println("the temp at 5 am is " + F3 + " fahrenheit\n");


            if (5<F){
                System.out.println(" the temperture is below 50F, it's freesing outside");

        }
else if (100<F){
                System.out.println(" the temperture is above 100F, it's hot outside");
            }

    }

}
