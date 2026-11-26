import java.util.Scanner;
public class WordAnalysis {
 public static void main(String[] args){Scanner in=new Scanner(System.in);System.out.print("Enter a sentence: ");String sentence=in.nextLine().trim();if(sentence.isEmpty()){System.out.println("Word count: 0");System.out.println("No longest word");}else{String[] words=sentence.split("\\s+");String longest=words[0];System.out.println("Word count: "+words.length);for(String word:words)if(word.length()>longest.length())longest=word;System.out.println("Longest word: "+longest);System.out.println("Words:");for(String word:words)System.out.println(word);}in.close();}
}
