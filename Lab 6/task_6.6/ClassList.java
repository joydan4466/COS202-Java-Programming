class ClassStudent {
 String name; int score;
 ClassStudent(String name,int score){this.name=name;this.score=score;}
 public String toString(){return name+" ("+score+")";}
}
public class ClassList {
 public static void main(String[] args){ClassStudent[] students={new ClassStudent("Amina",78),new ClassStudent("Tunde",55),new ClassStudent("Ngozi",91),new ClassStudent("Chika",64),new ClassStudent("Emeka",42),new ClassStudent("Bola",88),new ClassStudent("Ada",73),new ClassStudent("Uche",69),new ClassStudent("Zara",95),new ClassStudent("Ife",60)};
  int sum=0;ClassStudent highest=students[0];for(ClassStudent s:students){sum+=s.score;if(s.score>highest.score)highest=s;}System.out.println("Highest: "+highest);System.out.printf("Class average: %.2f%n",(double)sum/students.length);
 }
}
