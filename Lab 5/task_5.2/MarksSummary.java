import java.util.Scanner;
public class MarksSummary {
 public static void main(String[] args) {
  Scanner in=new Scanner(System.in); int count=0,sum=0,high=Integer.MIN_VALUE,low=Integer.MAX_VALUE;
  System.out.print("Enter mark (-1 to stop): "); int mark=in.nextInt();
  while(mark!=-1) {
   if(mark<0 || mark>100) System.out.println("Invalid mark; enter 0-100 or -1.");
   else {count++;sum+=mark;if(mark>high)high=mark;if(mark<low)low=mark;}
   System.out.print("Next mark (-1 to stop): "); mark=in.nextInt();
  }
  if(count==0) System.out.println("No valid marks entered.");
  else {System.out.println("Count: "+count);System.out.println("Sum: "+sum);System.out.printf("Average: %.2f%n",(double)sum/count);System.out.println("Highest: "+high);System.out.println("Lowest: "+low);}
  in.close();
 }
}
