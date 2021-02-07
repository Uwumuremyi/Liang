// Physics: finding runway length

import java.util.Scanner; 

public class Exercise_02_12 {

    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner( System.in );

        double length;
        double speed;
        double accelaration;

        System.out.print("Enter speed and accelaration: ");
        speed = input.nextDouble();

        accelaration = input.nextDouble();

        length = (speed * speed ) / (2 * accelaration);

        System.err.println("The minimum runway length for this plane is " + length);

    }
    
}
