import java.util.Scanner;
public class GuessingGame {
 public static void main(String[] args) {
  int secret=(int)(Math.random()*100)+1,attempts=0,guess;Scanner in=new Scanner(System.in);
  System.out.println("Guess the secret number (1-100).");
  do {System.out.print("Your guess: ");guess=in.nextInt();attempts++;if(guess>secret)System.out.println("Too high");else if(guess<secret)System.out.println("Too low");} while(guess!=secret);
  System.out.println("Correct! Attempts: "+attempts);in.close();
 }
}
