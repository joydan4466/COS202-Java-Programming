
import java.util.Scanner;

public class NewlineTrap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Clear the leftover newline
        input.nextLine();

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println();
        System.out.println("PERSONAL DETAILS");
        System.out.println("----------------");
        System.out.println("Age: " + age);
        System.out.println("Full Name: " + fullName);

        input.close();
    }
}
