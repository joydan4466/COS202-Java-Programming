import java.util.Scanner;
public class FactorialAndPower {
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in); System.out.print("Enter n (0-20): "); int n=in.nextInt();
  if(n<0 || n>20) System.out.println("Enter a value from 0 to 20.");
  else {long fact=1,power=1;for(int i=1;i<=n;i++){fact*=i;power*=2;}System.out.println(n+"! = "+fact);System.out.println("2^"+n+" = "+power);}
  in.close();
 }
}
