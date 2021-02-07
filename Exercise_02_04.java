// Convert pounds into kilograms

import java.util.Scanner;

public class Exercise_02_04 {

    public static void main(String[] args) {
        
        // create scanner

        Scanner input = new Scanner( System.in );

        double pounds;
        double kilograms;

        // prompt the user to enter pounds
        System.out.print("Enter a number in pounds: ");
        pounds = input.nextDouble();

        input.close();

        kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");

    }
    
}
