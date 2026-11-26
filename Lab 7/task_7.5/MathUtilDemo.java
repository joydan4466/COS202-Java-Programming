class MathUtil {
 public static boolean isPrime(int n){if(n<2)return false;for(int d=2;d*d<=n;d++)if(n%d==0)return false;return true;}
 public static long factorial(int n){if(n<0||n>20)throw new IllegalArgumentException("n must be 0-20");long f=1;for(int i=2;i<=n;i++)f*=i;return f;}
 public static int gcd(int a,int b){a=Math.abs(a);b=Math.abs(b);while(b!=0){int t=b;b=a%b;a=t;}return a;}
 public static long power(int base,int exponent){if(exponent<0||exponent>30)throw new IllegalArgumentException("exponent must be 0-30");long result=1;for(int i=0;i<exponent;i++)result*=base;return result;}
}
public class MathUtilDemo {
 public static void main(String[] args){int[] values={2,7,12,29};for(int n:values)System.out.println(n+" prime? "+MathUtil.isPrime(n));for(int n:new int[]{0,3,5,7})System.out.println(n+"! = "+MathUtil.factorial(n));int[][] pairs={{48,18},{20,8},{81,27},{17,13}};for(int[] p:pairs)System.out.println("gcd("+p[0]+","+p[1]+") = "+MathUtil.gcd(p[0],p[1]));for(int n=0;n<4;n++)System.out.println("3^"+n+" = "+MathUtil.power(3,n));}
}
