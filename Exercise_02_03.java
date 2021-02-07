// Convert feet into meeters

import java.util.Scanner;

public class Exercise_02_03

{

    public static void main(String[] args) {
        
        // create scanner

        Scanner input = new Scanner( System.in);

        double feet;
        double meters;

        // prompt the user to enter value for feet
        System.out.print("Enter a value for feet: ");
        feet = input.nextDouble();

        input.close();

        meters = feet * 0.305;

        System.out.println(feet + " feet is " + meters + " meters.");

    }
}