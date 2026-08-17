// Question: Take a number and print whether it's positive, negative, or zero.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.*;
public class Question001 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}

/*
My Approach:
Check whether the number is greater than 0.
num > 0 → Positive.
num < 0 → Negative.
Otherwise → Zero.
Use if-else if-else to handle all three cases.
*/