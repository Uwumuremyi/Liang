// Financial application: compound value

import java.util.Scanner; 

public class Exercise_02_13 {

    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner( System.in );

        double amount;
        double value1;
        double value2;
        double value3;
        double value4;
        double value5;
        double value6;

        System.out.print("Enter the monthly saving amount: ");

        amount = input.nextDouble();

        value1 = amount * ( 1 + 0.00417 );
        value2 = (amount + value1 ) * ( 1 + 0.00417 );
        value3 = (amount + value2 ) * ( 1 + 0.00417 );
        value4 = (amount + value3 ) * ( 1 + 0.00417 );
        value5 = (amount + value4 ) * ( 1 + 0.00417 );
        value6 = (amount + value5 ) * ( 1 + 0.00417 );

        System.out.println("After the sixth month, the account value is " + value6 );

    }
    
}
