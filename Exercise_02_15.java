// Geometry: distance of two points

import java.util.Scanner;

public class Exercise_02_15 {

    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        double x1;
        double x2;

        double y1;
        double y2;

        double distance;

        System.out.print("Enter x1 and y1: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        distance = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);

        System.out.println("The distance between the two points is " + distance);
    }

}
