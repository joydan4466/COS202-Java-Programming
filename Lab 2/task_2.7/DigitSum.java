
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Invalid input. Enter a number between 100 and 999.");
        } else {

            // Extract individual digits
            int firstDigit = number / 100;

            int secondDigit = (number / 10) % 10;

            int thirdDigit = number % 10;

            // Calculate the sum
            int sum = firstDigit + secondDigit + thirdDigit;

            System.out.println("First digit: " + firstDigit);
            System.out.println("Second digit: " + secondDigit);
            System.out.println("Third digit: " + thirdDigit);

            System.out.println("Sum of digits: " + sum);
        }

        input.close();
    }
}
