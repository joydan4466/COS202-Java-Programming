import java.util.Scanner;
public class Login {
 public static void main(String[] args) {
  final String USERNAME="cos202", PASSWORD="java123";
  Scanner in=new Scanner(System.in);
  System.out.print("Username: "); String user=in.nextLine();
  System.out.print("Password: "); String pass=in.nextLine();
  if (user.equals(USERNAME) && pass.equals(PASSWORD)) System.out.println("Access granted");
  else System.out.println("Access denied");
  in.close();
 }
}
