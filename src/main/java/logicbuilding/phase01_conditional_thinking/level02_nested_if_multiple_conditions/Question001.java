// Question:Take three sides and check if they form a valid triangle.
package logicbuilding.phase01_conditional_thinking.level02_nested_if_multiple_conditions;

import java.util.Scanner;

public class Question001 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Side: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Side: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Side: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
        sc.close();
    }
}

/*
My Approach:
1. Take three sides `a`, `b`, and `c`.
2. Check if all sides are positive.
3. A valid triangle must satisfy:
   `a + b > c`
   `a + c > b`
   `b + c > a`
4. If all three conditions are true → **Valid Triangle**.
5. Otherwise → **Invalid Triangle**.
*/