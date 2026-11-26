import java.util.Scanner;
public class EmailCheck {
 public static boolean isValidEmail(String email){if(email==null||email.contains(" "))return false;int at=email.indexOf('@');return at>0&&at==email.lastIndexOf('@')&&email.indexOf('.',at+1)>at+1&&email.indexOf('.',at+1)<email.length()-1;}
 public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter email: ");String email=in.nextLine();System.out.println(isValidEmail(email)?"Email passes the basic check":"Invalid email format");in.close();}
}
