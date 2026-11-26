import java.util.Scanner;
public class CaesarCipher {
 public static String caesar(String text,int shift){StringBuilder out=new StringBuilder();shift=((shift%26)+26)%26;for(char c:text.toCharArray()){if(Character.isUpperCase(c))out.append((char)('A'+(c-'A'+shift)%26));else if(Character.isLowerCase(c))out.append((char)('a'+(c-'a'+shift)%26));else out.append(c);}return out.toString();}
 public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter message: ");String message=in.nextLine();System.out.print("Enter shift: ");int shift=in.nextInt();String encrypted=caesar(message,shift);String decrypted=caesar(encrypted,-shift);System.out.println("Encrypted: "+encrypted);System.out.println("Decrypted: "+decrypted);in.close();}
}
