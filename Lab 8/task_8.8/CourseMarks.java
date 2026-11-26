import java.util.Scanner;
public class CourseMarks {
 public static void main(String[] args){final int STUDENTS=5,COURSES=4;int[][] marks=new int[STUDENTS][COURSES];Scanner in=new Scanner(System.in);
  for(int s=0;s<STUDENTS;s++)for(int c=0;c<COURSES;c++){do{System.out.print("Student "+(s+1)+", course "+(c+1)+" mark (0-100): ");marks[s][c]=in.nextInt();if(marks[s][c]<0||marks[s][c]>100)System.out.println("Enter a mark from 0 to 100.");}while(marks[s][c]<0||marks[s][c]>100);}
  System.out.println("\nStudent totals and averages:");for(int s=0;s<STUDENTS;s++){int total=0;for(int c=0;c<COURSES;c++)total+=marks[s][c];System.out.printf("Student %d: total=%d average=%.2f%n",s+1,total,(double)total/COURSES);}
  System.out.println("Course averages:");for(int c=0;c<COURSES;c++){int total=0;for(int s=0;s<STUDENTS;s++)total+=marks[s][c];System.out.printf("Course %d: %.2f%n",c+1,(double)total/STUDENTS);}in.close();}
}
