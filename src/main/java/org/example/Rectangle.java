package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String lengthString = input.nextLine();
        int lengthNumber = Integer.parseInt(lengthString);

        System.out.print("What is the width of the room in feet? ");
        String widthString = input.nextLine();
        int widthNumber = Integer.parseInt(widthString);

        DecimalFormat dfFeet = new DecimalFormat("#");
        DecimalFormat dfMeter = new DecimalFormat("#.###");
        double conversion = 0.09290304;
        double areaFeet = lengthNumber * widthNumber;
        double areaMeter = areaFeet * conversion;

        System.out.println("You entered dimensions of " + lengthNumber + " feet by " + widthNumber + " feet.");
        System.out.println("The area is\n" + dfFeet.format(areaFeet) + " square feet\n"
                           + dfMeter.format(areaMeter) + " square meters");

    }
}
