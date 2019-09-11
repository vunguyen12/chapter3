package example;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DemoRaise {
    public static void main(String[] args){
        double salary;
        pl("Demonstrating some raises:");
         pl("enter your salary: ");

        Scanner input = new Scanner(System.in);
        salary = input.nextDouble();
        predictRaise(salary);

    }
    public static void predictRaise(double salary)
    {
     double newSalary;
     final double RAISE_RATE = 1.10;
     newSalary = salary * RAISE_RATE;

     pl("current salary: " + salary +"\nafter raise :" + newSalary);

    }

    public static void pl(String p) {
        System.out.println(p);
    }
}
