
public class Swap {
    public static void main(String[] args) {

        int firstNumber = 25;
        int secondNumber = 50;

        System.out.println("BEFORE SWAPPING");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Temporary variable
        int temporary = firstNumber;

        firstNumber = secondNumber;

        secondNumber = temporary;

        System.out.println("\nAFTER SWAPPING");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
    }
}
