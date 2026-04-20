import java.util.Scanner;

public class LEVEL3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1
        System.out.println("Q1 Frequency of Each Digit");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        temp = number;

        // Store digits in array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Find frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}