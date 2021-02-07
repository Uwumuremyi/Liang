// Science: calculating energy

import java.util.Scanner;

public class Exercise_02_10 {

    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner( System.in );

        double amountOfWater;
        double initialTemperature;
        double finalTemperature;
        double energyNeeded;

        System.out.print("Enter the amount of water in kilograms: ");
        amountOfWater = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        initialTemperature = input.nextDouble();

        System.out.print("Enter the final temprerature: ");
        finalTemperature = input.nextDouble();

        energyNeeded = amountOfWater * (finalTemperature - initialTemperature ) * 4184;

        System.out.println("The energy needed is " + energyNeeded + " joules.");

    }
    
}
