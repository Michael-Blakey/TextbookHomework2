import java.util.Scanner;
public class Cylinder {

    public static void main(String[]args){
       final double PI = 3.1416;

       Scanner input = new Scanner(System.in);
       System.out.print("Enter the radius of base circle:");
       double radius = input.nextDouble();


        System.out.print("Enter the length of the cylinder:");
        double length  = input.nextDouble();

       double base_area = radius * PI;

       double volume = length *PI;

       System.out.println(radius + " radius = " + base_area + " base area ");

       System.out.println(length + " Length = " + volume + " volume ");
large





    }
}
