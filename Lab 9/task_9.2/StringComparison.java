import java.util.Scanner;
public class StringComparison {
 public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter first word: ");String a=in.next();System.out.print("Enter second word: ");String b=in.next();System.out.println("Exactly equal: "+a.equals(b));System.out.println("Equal ignoring case: "+a.equalsIgnoreCase(b));int result=a.compareToIgnoreCase(b);if(result<0)System.out.println(a+" comes first alphabetically");else if(result>0)System.out.println(b+" comes first alphabetically");else System.out.println("The words are alphabetically equivalent ignoring case");in.close();}
}
