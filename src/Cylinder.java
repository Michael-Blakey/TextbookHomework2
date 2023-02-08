
/**
 * Class Name: Cylinder
 * Author: Michael Blakey
 * Version: 1.0
 * Course: ITEC 2140 Section 01 Spring 2023
 * Date:  February 7, 2023
 */
import java.util.Scanner;
public class Cylinder {

    public static void main(String[]args){
       final double PI = 3.1416; //Number given in textbook example

       Scanner input = new Scanner(System.in);
       System.out.print("Enter the radius of base circle:"); // any given number will appear as wanted.
       double radius = input.nextDouble(); // variable we need to get the base area.


        System.out.print("Enter the length of the cylinder:");
        double length  = input.nextDouble();

       double base_area = radius * PI;

       double volume = length *PI;

       System.out.println(radius + " radius = " + base_area + " base area ");

       System.out.println(length + " Length = " + volume + " volume ");






    }
}
