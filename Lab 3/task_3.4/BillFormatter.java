
import java.util.Scanner;

public class BillFormatter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String item1, item2, item3;
        double price1, price2, price3;

        System.out.print("Enter first item: ");
        item1 = input.nextLine();

        System.out.print("Enter price: ");
        price1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter second item: ");
        item2 = input.nextLine();

        System.out.print("Enter price: ");
        price2 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter third item: ");
        item3 = input.nextLine();

        System.out.print("Enter price: ");
        price3 = input.nextDouble();

        double total = price1 + price2 + price3;

        System.out.println();
        System.out.println("========== CUSTOMER BILL ==========");

        System.out.printf("%-15s %12s%n", "ITEM", "PRICE");
        System.out.println("-----------------------------------");

        System.out.printf("%-15s %12.2f%n", item1, price1);
        System.out.printf("%-15s %12.2f%n", item2, price2);
        System.out.printf("%-15s %12.2f%n", item3, price3);

        System.out.println("-----------------------------------");
        System.out.printf("%-15s %12.2f%n", "TOTAL", total);

        input.close();
    }
}
