//Question: Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.

package logicbuilding.phase01_conditional_thinking.level02_nested_if_multiple_conditions;

import java.util.Scanner;

public class Question008 {
    void main() {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'm') {
            System.out.println("Character lies between 'a' and 'm'");
        }
        else if (ch >= 'n' && ch <= 'z') {
            System.out.println("Character lies between 'n' and 'z'");
        }
        else {
            System.out.println("Invalid input or not a lowercase alphabet");
        }
    }
}

/*
My Approach:
1. Take an alphabet character as input from the user.
2. Check whether the character lies between 'a' and 'm'.
3. If it does, print "Character lies between 'a' and 'm'".
4. Otherwise, check whether the character lies between 'n' and 'z'.
5. If it does, print "Character lies between 'n' and 'z'".
6. Otherwise, print "Invalid input or not a lowercase alphabet".
7. Close the Scanner after taking the input.
*/