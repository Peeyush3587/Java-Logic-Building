//Question: Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”.
package logicbuilding.phase01_conditional_thinking.level02_nested_if_multiple_conditions;

import java.util.Scanner;

public class Question005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Hour of the Day (0-23): ");
        int hour = sc.nextInt();

        if (hour >= 0 && hour <= 23) {
            if (hour >= 5 && hour < 12) {
                System.out.println("Good Morning");
            } else if (hour >= 12 && hour < 17) {
                System.out.println("Good Afternoon");
            } else if (hour >= 17 && hour < 21) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }
        } else {
            System.out.println("Invalid Hour! Please enter a number between 0 and 23.");
        }

        sc.close();
    }
}

/*
My Approach:
1. Take the hour of the day (0-23) as input from the user.
2. Check whether the entered hour is within the valid range of 0 to 23.
3. If the hour is less than 0 or greater than 23, print an invalid hour message.
4. If the hour is between 5 and 11, print "Good Morning".
5. Else if the hour is between 12 and 16, print "Good Afternoon".
6. Else if the hour is between 17 and 20, print "Good Evening".
7. Otherwise, print "Good Night" for hours between 21 and 23 or 0 and 4.
8. Close the Scanner after taking the input.
*/