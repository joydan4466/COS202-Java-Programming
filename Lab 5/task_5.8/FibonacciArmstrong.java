public class FibonacciArmstrong {
 public static void main(String[] args) {
  System.out.println("First 20 Fibonacci numbers:");int a=0,b=1;
  for(int i=0;i<20;i++){System.out.print(a+" ");int next=a+b;a=b;b=next;}
  System.out.println("\nArmstrong numbers from 100 to 999:");
  for(int n=100;n<=999;n++){int x=n,sum=0;while(x>0){int digit=x%10;sum+=digit*digit*digit;x/=10;}if(sum==n)System.out.print(n+" ");}
  System.out.println();
 }
}
