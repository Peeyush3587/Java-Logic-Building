//Question: Check if a number is even or odd.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.*;
public class Question002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        sc.close();
    }
}

/*
My Approach:
1. Check if the number is divisible by `2`.
2. Use `%` to get the remainder.
3. `num % 2 == 0` → **Even**.
4. Otherwise → **Odd**.
5. Use a simple `if-else`; `0` is **Even**.
 */