// Current Time

import java.util.Scanner;

public class Exercise_02_08 {

    public static void main(String[] args) {
        
        // Create scanner
        Scanner input = new Scanner( System.in );

        long offset;

        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextLong();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        currentHour = currentHour + offset;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

    }
    
}
