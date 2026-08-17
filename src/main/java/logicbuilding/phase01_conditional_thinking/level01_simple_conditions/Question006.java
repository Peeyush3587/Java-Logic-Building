//Question:Take two numbers and print the larger one.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.*;
public class Question006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is Larger.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is Larger.");
        } else {
            System.out.println("Both numbers are Equal.");
        }
        sc.close();
    }
}

/*
My Approach:
1. Take two numbers as input.
2. Compare `num1` and `num2` using `>`.
3. `num1 > num2` → `num1` is Larger.
4. `num2 > num1` → `num2` is Larger.
5. Otherwise → Both numbers are Equal.
*/