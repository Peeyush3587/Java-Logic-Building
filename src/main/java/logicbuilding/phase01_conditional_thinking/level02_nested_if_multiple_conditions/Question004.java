// Question: Check if one of two given numbers is a multiple of the other.

package logicbuilding.phase01_conditional_thinking.level02_nested_if_multiple_conditions;

import java.util.Scanner;

public class Question004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();

        if (num1 == 0 && num2 == 0) {
            System.out.println("Both numbers are zero.");
        } else if (num1 == 0 || num2 == 0) {
            System.out.println("One number is a multiple of the other.");
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " is a multiple of " + num1);
        } else {
            System.out.println("Neither number is a multiple of the other.");
        }

        sc.close();
    }
}

/*
My Approach:
1. Take two numbers as input from the user.
2. Check whether both numbers are zero.
3. If both are zero, print that both numbers are zero.
4. If one number is zero, print that one number is a multiple of the other.
5. If num1 % num2 == 0, then num1 is a multiple of num2.
6. Else if num2 % num1 == 0, then num2 is a multiple of num1.
7. Otherwise, print that neither number is a multiple of the other.
8. Handle zero separately to avoid division by zero.
*/
