import java.util.Scanner;
public class LinearSearch {
 public static int indexOf(int[] data,int target){for(int i=0;i<data.length;i++)if(data[i]==target)return i;return -1;}
 public static void main(String[] args){int[] values={12,25,7,40,18,33};Scanner in=new Scanner(System.in);System.out.print("Enter number to search: ");int target=in.nextInt();int index=indexOf(values,target);if(index==-1)System.out.println("Not found");else System.out.println("Found at index "+index+" (position "+(index+1)+")");in.close();}
}
