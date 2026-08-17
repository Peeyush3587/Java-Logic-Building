//Question: Check if a number is divisible by 5.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.*;
public class Question003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " is Divisible by 5");
        } else {
            System.out.println(num + " is not Divisible by 5");
        }
        sc.close();
    }
}

/*
My Approach:
1. Check if the number is divisible by `5`.
2. Use `%` to get the remainder.
3. `num % 5 == 0` → Divisible by `5`.
4. Otherwise → Not divisible by `5`.
5. Use a simple `if-else`.
*/
