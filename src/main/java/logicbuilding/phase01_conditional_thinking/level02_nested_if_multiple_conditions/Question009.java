//Question: Take a day number (1–7) and print the corresponding day name.

package logicbuilding.phase01_conditional_thinking.level02_nested_if_multiple_conditions;

import java.util.Scanner;

public class Question009 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Day Number: ");
        int day = sc.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number");
        }
    }
}

/*
My Approach:
1. Take a day number (1–7) as input from the user.
2. Check whether the day number is 1.
3. If it is, print "Monday".
4. Otherwise, check whether the day number is 2.
5. Continue checking for day numbers 3, 4, 5, 6, and 7.
6. Print the corresponding day name when a match is found.
7. If the input is not between 1 and 7, print "Invalid day number".
8. Close the Scanner after taking the input.
*/