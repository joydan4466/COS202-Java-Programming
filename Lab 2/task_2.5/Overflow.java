
public class Overflow {
    public static void main(String[] args) {

        int maxInt = Integer.MAX_VALUE;

        int intResult = maxInt + 1;

        long longResult = (long) maxInt + 1;

        System.out.println("INTEGER OVERFLOW");
        System.out.println("----------------------");

        System.out.println("Maximum Integer: " + maxInt);

        System.out.println("Integer Result: " + intResult);

        System.out.println("Long Result: " + longResult);
    }
}
