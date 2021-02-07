import java.util.Scanner;

public class Exercise_02_02 {

    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner( System.in);

        double radius;
        double length;
        double area;
        double volume;

        // prompt the user to enter the radius and the length
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();

        area = radius * radius * Math.PI;
        volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume );

    }
    
}
