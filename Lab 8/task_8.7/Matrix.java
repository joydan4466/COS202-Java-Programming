import java.util.Scanner;
public class Matrix {
 public static void main(String[] args){int[][] m=new int[3][3];Scanner in=new Scanner(System.in);for(int r=0;r<3;r++)for(int c=0;c<3;c++){System.out.print("Enter row "+(r+1)+", column "+(c+1)+": ");m[r][c]=in.nextInt();}
  System.out.println("Matrix and row sums:");for(int r=0;r<3;r++){int sum=0;for(int c=0;c<3;c++){System.out.printf("%5d",m[r][c]);sum+=m[r][c];}System.out.println(" | row sum = "+sum);}
  System.out.println("Column sums:");for(int c=0;c<3;c++){int sum=0;for(int r=0;r<3;r++)sum+=m[r][c];System.out.println("Column "+(c+1)+": "+sum);}
  int diagonal=0;for(int i=0;i<3;i++)diagonal+=m[i][i];System.out.println("Main diagonal sum: "+diagonal);in.close();}
}
