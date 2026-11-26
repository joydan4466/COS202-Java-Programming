import java.util.Scanner;
public class GradeCalculator {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter score (0-100): "); int score = in.nextInt();
  if (score < 0 || score > 100) System.out.println("Invalid score");
  else {
   char grade;
   if (score >= 70) grade='A'; else if (score >= 60) grade='B';
   else if (score >= 50) grade='C'; else if (score >= 45) grade='D';
   else if (score >= 40) grade='E'; else grade='F';
   System.out.println("Grade: " + grade);
  }
  in.close();
 }
}
