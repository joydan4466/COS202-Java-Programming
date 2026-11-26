public class Recursion {
 public static long sumFirstN(int n){if(n<0)throw new IllegalArgumentException("n cannot be negative");if(n==0)return 0;return n+sumFirstN(n-1);}
 public static long power(int base,int exponent){if(exponent<0)throw new IllegalArgumentException("exponent cannot be negative");if(exponent==0)return 1;return base*power(base,exponent-1);}
 public static String reverse(String s){if(s.isEmpty())return s;return reverse(s.substring(1))+s.charAt(0);}
 public static void main(String[] args){System.out.println("Sum 1 to 5: "+sumFirstN(5));System.out.println("2^5: "+power(2,5));System.out.println("Reverse Java: "+reverse("Java"));}
}
