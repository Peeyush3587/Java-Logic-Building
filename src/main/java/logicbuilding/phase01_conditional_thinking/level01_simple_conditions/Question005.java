//Question:Check if a given year is a leap year.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.*;
public class Question005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        sc.close();
    }
}

/*
My Approach:
1. Check if the year is divisible by `400`.
2. OR check if it is divisible by `4` but not by `100`.
3. `(year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)` → Leap Year.
4. Otherwise → Not a Leap Year.
5. Use `||` and `&&` to combine the conditions.
*/