import java.util.Scanner;
public class MonthDays {
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  System.out.print("Enter year: "); int year=in.nextInt();
  System.out.print("Enter month number (1-12): "); int month=in.nextInt();
  if (year<1 || month<1 || month>12) System.out.println("Invalid year or month");
  else {
   int days;
   switch(month) {
    case 4: case 6: case 9: case 11: days=30; break;
    case 2: boolean leap=(year%4==0 && year%100!=0) || year%400==0; days=leap?29:28; break;
    default: days=31;
   }
   System.out.println("Number of days: "+days);
  }
  in.close();
 }
}
