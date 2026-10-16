//Question: Check voting eligibility for a given age (18+).

package logicbuilding.phase01_conditional_thinking.level02_nested_if_multiple_conditions;

import java.util.Scanner;

public class Question006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 100) {
            if (age >= 18) {
                System.out.println("Eligible To Vote!!!");
            } else {
                System.out.println("Not Eligible To Vote!!!");
            }
        } else {
            System.out.println("Invalid Age! Please enter an age between 0 and 100.");
        }

        sc.close();
    }
}

/*
My Approach:
1. Take the age as input from the user.
2. Check whether the entered age is within the valid range of 0 to 100.
3. If the age is less than 0 or greater than 100, print an invalid age message.
4. If the age is 18 or above, print "Eligible To Vote!!!".
5. Otherwise, print "Not Eligible To Vote!!!" for ages below 18.
6. Close the Scanner after taking the input.
*/
