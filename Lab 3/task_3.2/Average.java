
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first test score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter second test score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter third test score: ");
        double score3 = input.nextDouble();

        double average = (score1 + score2 + score3) / 3;

        System.out.printf("Average score: %.1f%n", average);

        input.close();
    }
}
