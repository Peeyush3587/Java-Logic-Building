//Question:Check if a number is divisible by both 3 and 5.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.*;
public class Question004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is Divisible by both 3 and 5");
        } else {
            System.out.println(num + " is not Divisible by both 3 and 5");
        }
        sc.close();
    }
}

/*
My Approach:
1. Check divisibility by `3` using `%`.
2. Check divisibility by `5` using `%`.
3. `num % 3 == 0 && num % 5 == 0` → Divisible by both.
4. Otherwise → Not divisible by both.
5. Use `&&` because both conditions must be true.
*/