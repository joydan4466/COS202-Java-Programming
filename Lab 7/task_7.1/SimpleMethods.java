public class SimpleMethods {
 public static int cube(int n){return n*n*n;}
 public static boolean isOdd(int n){return n%2!=0;}
 public static int maxOfThree(int a,int b,int c){int max=a;if(b>max)max=b;if(c>max)max=c;return max;}
 public static void main(String[] args){System.out.println("Cube of 3: "+cube(3));System.out.println("Is 7 odd? "+isOdd(7));System.out.println("Largest: "+maxOfThree(12,35,21));}
}
