import java.util.Scanner;
public class ArrayBasics {
 public static void main(String[] args){Scanner in=new Scanner(System.in);int[] a=new int[10];int sum=0;
  for(int i=0;i<a.length;i++){System.out.print("Enter integer "+(i+1)+": ");a[i]=in.nextInt();sum+=a[i];}
  double avg=(double)sum/a.length;int max=a[0],min=a[0],above=0;for(int x:a){if(x>max)max=x;if(x<min)min=x;if(x>avg)above++;}
  System.out.println("Sum: "+sum);System.out.printf("Average: %.2f%n",avg);System.out.println("Maximum: "+max);System.out.println("Minimum: "+min);System.out.println("Above average: "+above);in.close();
 }
}
