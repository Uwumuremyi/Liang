// Physic: acceleration

import java.util.Scanner;

import jdk.jfr.Timespan;

public class Exercise_02_09 {

    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner( System.in);

        double startingVelocity; //v0
        double endingVelocity; // v1
        double timeSpan;
        double acceleration;

        System.out.print("Enter v0, v1, and t: ");
        startingVelocity = input.nextDouble();
        endingVelocity = input.nextDouble();
        timeSpan = input.nextDouble();

        acceleration = (endingVelocity - startingVelocity) / timeSpan;

        System.out.println("The average accelaration is " + acceleration);
    }
    
}
