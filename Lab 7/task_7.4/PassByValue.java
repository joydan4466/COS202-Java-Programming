public class PassByValue {
 public static void swap(int a,int b){int temp=a;a=b;b=temp;System.out.println("Inside swap: a="+a+", b="+b);}
 public static void main(String[] args){int x=10,y=20;System.out.println("Before: x="+x+", y="+y);swap(x,y);System.out.println("After call: x="+x+", y="+y);System.out.println("The caller values are unchanged because Java passes copies of primitive values.");}
}
