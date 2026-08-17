//Question:Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.Scanner;

public class Question010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase Letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase Letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }
        sc.close();
    }
}

/*
My Approach:
1. Take a character as input.
2. `A-Z` → **Uppercase**.
3. `a-z` → **Lowercase**.
4. `0-9` → **Digit**.
5. Otherwise → **Special Character**.
6. Use `if-else if-else` to check the character range.
*/