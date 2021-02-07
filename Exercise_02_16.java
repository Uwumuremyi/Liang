// Geometry: area of a hexagon

import java.util.Scanner; 

public class Exercise_02_16 {

    public static void main(String[] args) {
        
        // create scanner
        Scanner input = new Scanner( System.in );

        double side;
        double area;

        System.out.print("Enter the side of a hexagon: ");
        side = input.nextDouble();

        area = ( 3 * Math.sqrt(3) / 2 ) * side * side;


        System.out.println("The area of the hexagon is " + area );
    }
    
}
