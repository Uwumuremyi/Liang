// Financial application ( Calculate tips )

import java.util.Scanner;

public class Exercise_02_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner input = new Scanner(System.in);

        double subtotal;
        double gratuityRate;

        double gratuity;
        double total;

        // prompt the user for subtotal
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        input.close();

        gratuity = subtotal * ( gratuityRate / 100 );

        total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total );

    }

}
