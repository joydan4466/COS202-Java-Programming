import java.util.Arrays;
public class ReverseAndCopy {
 public static void main(String[] args){int[] original={10,20,30,40,50};System.out.println("Original: "+Arrays.toString(original));System.out.print("Reverse order: ");for(int i=original.length-1;i>=0;i--)System.out.print(original[i]+" ");
  int[] reversed=new int[original.length];for(int i=0;i<original.length;i++)reversed[i]=original[original.length-1-i];System.out.println("\nReversed copy: "+Arrays.toString(reversed));System.out.println("Original unchanged: "+Arrays.toString(original));}
}
