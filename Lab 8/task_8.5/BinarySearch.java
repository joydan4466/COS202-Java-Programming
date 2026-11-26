import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
 public static int binarySearch(int[] data,int target){int low=0,high=data.length-1,comparisons=0;while(low<=high){int mid=low+(high-low)/2;comparisons++;if(data[mid]==target){System.out.println("Comparisons: "+comparisons);return mid;}if(data[mid]<target)low=mid+1;else high=mid-1;}System.out.println("Comparisons: "+comparisons);return -1;}
 public static void main(String[] args){int[] a={42,12,7,90,23,56,31,5};Arrays.sort(a);System.out.println("Sorted array: "+Arrays.toString(a));Scanner in=new Scanner(System.in);System.out.print("Search value: ");int target=in.nextInt();int index=binarySearch(a,target);System.out.println(index<0?"Not found":"Found at index "+index);in.close();}
}
