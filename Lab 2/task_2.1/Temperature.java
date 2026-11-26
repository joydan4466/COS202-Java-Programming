
public class Temperature {
    public static void main(String[] args) {

        double celsius = 36.6;

        // Correct calculation
        double fahrenheit = celsius * (9.0 / 5) + 32;

        // Calculation using integer division
        double wrongFahrenheit = celsius * (9 / 5) + 32;

        System.out.println("Temperature Conversion");
        System.out.println("----------------------");

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        System.out.println("Using 9/5: " + wrongFahrenheit);
        System.out.println("Using 9.0/5: " + fahrenheit);
    }
}
