//Question:Take three numbers and print the largest.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.Scanner;

public class Question007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is Largest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is Largest.");
        } else {
            System.out.println(num3 + " is Largest.");
        }
        sc.close();
    }
}

/*
My Approach:
1. Take three numbers as input.
2. Compare `num1` with `num2` and `num3`.
3. `num1 > num2 && num1 > num3` → `num1` is Largest.
4. `num2 > num1 && num2 > num3` → `num2` is Largest.
5. Otherwise → `num3` is Largest.
*/