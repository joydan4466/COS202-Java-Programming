import java.util.Random;
public class DiceFrequency {
 public static void main(String[] args){int[] frequency=new int[7];Random random=new Random();for(int i=0;i<60;i++){int roll=random.nextInt(6)+1;frequency[roll]++;}System.out.println("Results of 60 dice throws:");for(int face=1;face<=6;face++)System.out.println(face+": "+frequency[face]);}
}
