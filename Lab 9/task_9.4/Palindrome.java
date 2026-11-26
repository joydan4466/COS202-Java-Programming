import java.util.Scanner;
public class Palindrome {
 public static boolean isPalindrome(String s){String cleaned=s.toLowerCase().replaceAll("[^a-z0-9]","");return new StringBuilder(cleaned).reverse().toString().equals(cleaned);}
 public static void main(String[] args){Scanner in=new Scanner(System.in);String test="A man, a plan, a canal: Panama";System.out.println("Test phrase: "+test);System.out.println("Is palindrome? "+isPalindrome(test));System.out.print("Enter another phrase: ");System.out.println("Is palindrome? "+isPalindrome(in.nextLine()));in.close();}
}
