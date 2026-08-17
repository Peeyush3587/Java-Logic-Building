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
 * Explanation:
 * The value stored in `number` is the input that the conditions or loops work on.
 * The if/else checks test the important cases in order: `number > 0`, `number < 0`.
 * Only the branch whose condition becomes true prints its message.
 */