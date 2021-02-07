// Health application: computing BMI

import java.util.Scanner;

public class Exercise_02_14 {
    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner( System.in );

        double bmi;
        double pounds;
        double inches;

        double kilograms;
        double meters;


        System.out.print("Enter weight in pounds: ");
        pounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        inches = input.nextDouble();

        kilograms = pounds * 0.45359237;

        meters = inches * 0.0254;

        bmi = kilograms / (meters * meters);

        System.out.println("BMI is " + bmi);
    }
}
