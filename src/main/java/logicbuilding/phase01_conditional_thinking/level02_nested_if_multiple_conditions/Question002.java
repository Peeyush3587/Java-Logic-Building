// Question:If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
package logicbuilding.phase01_conditional_thinking.level02_nested_if_multiple_conditions;

import java.util.Scanner;

public class Question002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Side: ");
        int a = sc.nextInt();

        System.out.print("Enter the Second Side: ");
        int b = sc.nextInt();

        System.out.print("Enter the Third Side: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

        } else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}

/*
My Approach:
1. Take three sides `a`, `b`, and `c`.
2. First check if they form a valid triangle.
3. If invalid → print "Invalid Triangle".
4. If `a == b && b == c` → **Equilateral**.
5. Else if any two sides are equal → **Isosceles**.
6. Otherwise → **Scalene**.
7. Always validate the triangle before determining its type.
*/