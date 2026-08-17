//Question:Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
package logicbuilding.phase01_conditional_thinking.level01_simple_conditions;

import java.util.Scanner;

public class Question008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature: ");
        int temperature = sc.nextInt();

        if (temperature < 15) {
            System.out.println("Cold");
        } else if (temperature < 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
        sc.close();
    }
}

/*
My Approach:
1. Take the temperature as input.
2. `temperature < 15` → **Cold**.
3. `15 <= temperature < 30` → **Warm**.
4. `temperature >= 30` → **Hot**.
5. Use `if-else if-else` for the ranges.
*/