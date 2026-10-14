// Question: Take marks (0–100) and print the corresponding grade (A/B/C/D/F).

package logicbuilding.phase01_conditional_thinking.level02_nested_if_multiple_conditions;

import java.util.Scanner;

public class Question003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 0 && marks <= 100) {

            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 80) {
                System.out.println("Grade B");
            } else if (marks >= 70) {
                System.out.println("Grade C");
            } else if (marks >= 60) {
                System.out.println("Grade D");
            } else {
                System.out.println("Grade F");
            }

        } else {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }
}

/*
My Approach:
1. Take marks as input from the user.
2. First check whether the marks are between 0 and 100.
3. If invalid -> print "Invalid Marks".
4. If marks >= 90 -> Grade A.
5. Else if marks >= 80 -> Grade B.
6. Else if marks >= 70 -> Grade C.
7. Else if marks >= 60 -> Grade D.
8. Otherwise -> Grade F.
9. Validate the marks before determining the grade.
*/