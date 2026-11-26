import java.util.Scanner;
public class StringBasics {
 public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter a sentence: ");String s=in.nextLine();System.out.println("Length: "+s.length());if(s.isEmpty())System.out.println("There are no first or last characters.");else{System.out.println("First character: "+s.charAt(0));System.out.println("Last character: "+s.charAt(s.length()-1));}System.out.println("Uppercase: "+s.toUpperCase());System.out.println("Lowercase: "+s.toLowerCase());in.close();}
}
