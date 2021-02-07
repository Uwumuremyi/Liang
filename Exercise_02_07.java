// Find the number of years

import java.util.Scanner;

public class Exercise_02_07 {

    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner( System.in);

        long minutes;

        long years;

        long days;

        long remainingDays;

        // prompt the user to enter minutes
        System.out.println("Enter the number of minutes: ");
        minutes = input.nextLong();

        days = minutes / 1440;

        remainingDays = days % 365;

        years = days / 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");

    }
    
}
