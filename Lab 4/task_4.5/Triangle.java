import java.util.Scanner;
public class Triangle {
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  System.out.print("Enter three side lengths: "); double a=in.nextDouble(), b=in.nextDouble(), c=in.nextDouble();
  if (a<=0 || b<=0 || c<=0 || a+b<=c || a+c<=b || b+c<=a) System.out.println("Not a valid triangle");
  else if (a==b && b==c) System.out.println("Equilateral triangle");
  else if (a==b || a==c || b==c) System.out.println("Isosceles triangle");
  else System.out.println("Scalene triangle");
  in.close();
 }
}
