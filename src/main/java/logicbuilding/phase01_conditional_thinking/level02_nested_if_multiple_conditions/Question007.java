//Question: Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

package logicbuilding.phase01_conditional_thinking.level02_nested_if_multiple_conditions;

import java.util.Scanner;

public class Question007 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even.");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both numbers are odd.");
        } else {
            System.out.println("One number is even and one is odd.");
        }
    }
}

/*
My Approach:
1. Take two numbers as input from the user.
2. Check whether both numbers are divisible by 2.
3. If both numbers are divisible by 2, print "Both numbers are even".
4. Otherwise, check whether both numbers are not divisible by 2.
5. If both numbers are not divisible by 2, print "Both numbers are odd".
6. Otherwise, print "One number is even and one is odd".
7. Close the Scanner after taking the input.
*/