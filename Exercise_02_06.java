// Sum the digit in an integer

import java.util.Scanner;

public class Exercise_02_06 {

    public static void main(String[] args) {
        
        // Create scanner
        Scanner input = new Scanner( System.in );

        int number;
        int digit1;
        int digit2;
        int digit3;

        int sum;

        System.out.print("Enter a number between 0 and 1000: ");
        number = input.nextInt();

        digit3 = number % 10;
        number = number / 10;

        digit2 = number % 10;
        number = number / 10;

        digit1 = number;

        sum = digit1 + digit2 + digit3;

        System.out.println("The sum of the digits is " + sum );

    }
    
}
