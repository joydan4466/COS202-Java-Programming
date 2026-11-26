import java.util.Scanner;
public class Patterns {
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in);System.out.print("Enter height (1-20): ");int n=in.nextInt();
  if(n<1||n>20){System.out.println("Invalid height");return;}
  System.out.println("Right triangle:");for(int r=1;r<=n;r++){for(int c=1;c<=r;c++)System.out.print("* ");System.out.println();}
  System.out.println("Inverted triangle:");for(int r=n;r>=1;r--){for(int c=1;c<=r;c++)System.out.print("* ");System.out.println();}
  System.out.println("Number pyramid:");for(int r=1;r<=n;r++){for(int c=1;c<=r;c++)System.out.print(c);System.out.println();}
  in.close();
 }
}
