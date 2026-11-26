
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReportFile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try (PrintWriter out =
                new PrintWriter(new FileWriter("names.txt"))) {

            System.out.println("ENTER FIVE STUDENT NAMES");
            System.out.println("------------------------");

            for (int i = 1; i <= 5; i++) {

                System.out.print("Enter name " + i + ": ");

                String name = input.nextLine();

                out.println(i + ". " + name);
            }

            System.out.println();
            System.out.println("Names successfully saved to names.txt");

        } catch (IOException e) {

            System.out.println("Error writing to file: " + e.getMessage());
        }

        input.close();
    }
}
