import java.util.Scanner;
public class LetterFrequency {
 public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter a paragraph: ");String paragraph=in.nextLine().toLowerCase();int[] frequency=new int[26];for(int i=0;i<paragraph.length();i++){char c=paragraph.charAt(i);if(c>='a'&&c<='z')frequency[c-'a']++;}System.out.println("Letter frequency:");for(int i=0;i<26;i++)System.out.printf("%c : %d%n",(char)('a'+i),frequency[i]);in.close();}
}
