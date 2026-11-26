
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTotals {
    public static void main(String[] args) {

        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int count = 0;

        try (Scanner file = new Scanner(new File("scores.txt"))) {

            while (file.hasNextInt()) {

                int score = file.nextInt();

                sum += score;
                count++;

                if (score > largest) {
                    largest = score;
                }
            }

            if (count > 0) {

                double average = (double) sum / count;

                System.out.println("FILE TOTALS");
                System.out.println("-------------------");

                System.out.println("Number of scores: " + count);
                System.out.println("Sum: " + sum);
                System.out.println("Largest score: " + largest);

                System.out.printf("Average: %.2f%n", average);

            } else {
                System.out.println("The file contains no valid scores.");
            }

        } catch (FileNotFoundException e) {

            System.out.println("Error: scores.txt was not found.");
        }
    }
}
