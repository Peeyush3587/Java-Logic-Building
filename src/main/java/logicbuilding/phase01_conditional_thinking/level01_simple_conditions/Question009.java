//Question:Take a character and check if it’s a vowel or consonant.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.Scanner;

public class Question009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }
        sc.close();
    }
}

/*
My Approach:
1. Take a character as input.
2. Check if it is `a`, `e`, `i`, `o`, or `u`.
3. If it matches any vowel → **Vowel**.
4. Otherwise → **Consonant**.
5. Use `||` to combine the vowel conditions.
*/