
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RobustFileTotals {
    public static void main(String[] args) {

        File scoresFile = new File("scores.txt");

        // Check whether the file exists
        if (!scoresFile.exists()) {
            System.out.println("Sorry, scores.txt does not exist.");
            System.out.println("Please create the file and try again.");
            return;
        }

        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int count = 0;

        try (Scanner file = new Scanner(scoresFile)) {

            while (file.hasNext()) {

                if (file.hasNextInt()) {

                    int score = file.nextInt();

                    sum += score;
                    count++;

                    if (score > largest) {
                        largest = score;
                    }

                } else {
                    System.out.println(
                        "Warning: Invalid data found: " + file.next()
                    );
                }
            }

            if (count == 0) {
                System.out.println("No valid scores were found.");
                return;
            }

            double average = (double) sum / count;

            System.out.println("ROBUST FILE TOTALS");
            System.out.println("------------------");
            System.out.println("Number of scores: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Largest score: " + largest);
            System.out.printf("Average: %.2f%n", average);

        } catch (FileNotFoundException e) {

            System.out.println("Unable to open scores.txt.");
        }
    }
}
