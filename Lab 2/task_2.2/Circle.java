
public class Circle {
    public static void main(String[] args) {

        double radius = 7.5;

        double area = Math.PI * Math.pow(radius, 2);

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circle Calculations");
        System.out.println("-------------------");

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
