// print a table

public class Exercise_02_18
{

    public static void main(String[] args) {
        
        System.out.println("a   b   pow(a,b)");
        System.out.print("1   " + (int)(1+1) + "   " + (int)(Math.pow(1, 1+1)));
        System.out.print("\n2   " + (int)(2+1) + "   " + (int)(Math.pow(2, 2+1 )));
        System.out.print("\n3   " + (int)(3+1) + "   " + (int)(Math.pow(3, 3+1 )));
        System.out.print("\n4   " + (int)(4+1) + "   " + (int)(Math.pow(4, 4+1 )));
        System.out.print("\n5   " + (int)(5+1) + "   " + (int)(Math.pow(5, 5+1 )));
        System.out.println();
    }
}