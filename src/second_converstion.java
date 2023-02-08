/**
 * Class Name: second_converstion
 * Author: Michael Blakey
 * Version: 1.0
 * Course: ITEC 2140 Section 01 Spring 2023
 * Date:  February 7, 2023
 */

import java.util.Scanner;
public class second_converstion {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a second value");
        int second = input.nextInt();
        int HOURS = second / 60;
        int MINUTES = second % 60;
        int SECONDS = second % 60;
        HOURS = second / 60;
        System.out.println(HOURS + " hours, " + MINUTES + " minutes, " + SECONDS + " seconds, " );




    }
}
