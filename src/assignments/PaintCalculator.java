package assignments;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[]args){
        double length;
        double height;
        double width;
        Scanner input =new Scanner (System.in);

        pl("what is the length ?");
        length = input.nextDouble();
        pl("what is the height");
        height = input.nextDouble();
        pl("what is the width");
        width =input.nextDouble();
        wallarea(length,height,width);
    }
    public static void wallarea(double length, double height, double width) {
        double squareFootroom;
        double heightOfTheRoom;
        double totalOfRoom;
        squareFootroom = length*width;
        heightOfTheRoom =  height*length;
        totalOfRoom = squareFootroom + heightOfTheRoom;
        pl("the length of the room is " + length +" the width is " + width +" the height is "+ height);
        pl(" the square feet of the room is "+squareFootroom+" and height " + heightOfTheRoom);
        pl("the room is " + totalOfRoom + " square foot");

        numgallon(totalOfRoom);

    }
    public static void numgallon( double totalOfRoom) {
        double numOfgallon;
        int gallon = 350;

        numOfgallon= Math.ceil(totalOfRoom / gallon);

        pl( "the room need " + numOfgallon + " gallon to fill");
        pricetotal(numOfgallon);


    }
    public static void pricetotal(double numGallon) {
        int totalPrice = (int) (numGallon *32);
        pl(" the total of price is " + totalPrice + "$");
    }
    public static void pl(String p) {
        System.out.println(p);
    }

}
