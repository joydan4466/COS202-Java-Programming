import java.util.Scanner;
public class PassFail {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter score: "); int score = in.nextInt();
  System.out.println(score >= 40 ? "Pass" : "Fail");
  in.close();
 }
}
