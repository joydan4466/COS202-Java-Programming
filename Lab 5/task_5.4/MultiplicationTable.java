import java.util.Scanner;
public class MultiplicationTable {
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in);System.out.print("Enter a number: ");int n=in.nextInt();
  for(int i=1;i<=12;i++)System.out.printf("%d x %2d = %d%n",n,i,n*i);
  in.close();
 }
}
