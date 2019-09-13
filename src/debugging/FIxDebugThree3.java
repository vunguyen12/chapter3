package debugging;

import java.util.Scanner;

public class FIxDebugThree3 {
    private static String name;
    public static void main(String args[])
    {

        name = getName();
        displayGreeting(name);
    }
    public static String getName()
    {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name ");
        name = input.nextLine();
        return name;
    }
    public static void displayGreeting(String name)
    {
        System.out.println("Hello, " + name + "!");
    }
}
