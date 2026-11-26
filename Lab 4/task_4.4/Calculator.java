import java.util.Scanner;
public class Calculator {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter first number: "); double a=in.nextDouble();
  System.out.print("Enter operator (+ - * /): "); String op=in.next();
  System.out.print("Enter second number: "); double b=in.nextDouble();
  switch(op) {
   case "+": System.out.println("Answer: "+(a+b)); break;
   case "-": System.out.println("Answer: "+(a-b)); break;
   case "*": System.out.println("Answer: "+(a*b)); break;
   case "/": if (b==0) System.out.println("Error: division by zero"); else System.out.println("Answer: "+(a/b)); break;
   default: System.out.println("Error: unknown operator");
  }
  in.close();
 }
}
