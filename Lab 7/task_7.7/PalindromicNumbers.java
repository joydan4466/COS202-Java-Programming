public class PalindromicNumbers {
 public static boolean isPalindrome(int n){if(n<0)return false;int original=n,reverse=0;while(n>0){reverse=reverse*10+n%10;n/=10;}return original==reverse;}
 public static void main(String[] args){System.out.println("Palindromic numbers from 100 to 999:");for(int n=100;n<=999;n++)if(isPalindrome(n))System.out.print(n+" ");System.out.println();}
}
