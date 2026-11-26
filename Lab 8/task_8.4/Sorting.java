import java.util.Arrays;
public class Sorting {
 public static void bubbleSort(int[] a){for(int pass=0;pass<a.length-1;pass++)for(int i=0;i<a.length-1-pass;i++)if(a[i]>a[i+1]){int t=a[i];a[i]=a[i+1];a[i+1]=t;}}
 public static void selectionSort(int[] a){for(int i=0;i<a.length-1;i++){int min=i;for(int j=i+1;j<a.length;j++)if(a[j]<a[min])min=j;int t=a[i];a[i]=a[min];a[min]=t;}}
 public static void test(String label,int[] data){int[] bubble=data.clone(),selection=data.clone(),builtIn=data.clone();bubbleSort(bubble);selectionSort(selection);Arrays.sort(builtIn);System.out.println("\n"+label+" input: "+Arrays.toString(data));System.out.println("Bubble: "+Arrays.toString(bubble));System.out.println("Selection: "+Arrays.toString(selection));System.out.println("Arrays.sort: "+Arrays.toString(builtIn));}
 public static void main(String[] args){test("Sorted",new int[]{1,2,3,4,5});test("Reversed",new int[]{5,4,3,2,1});test("Random",new int[]{8,3,6,1,9,2});}
}
