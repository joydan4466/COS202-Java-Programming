public class Student {
 private String name; private int score;
 public Student(String name,int score){this.name=name;setScore(score);}
 public String getName(){return name;} public int getScore(){return score;}
 public void setScore(int score){if(score>=0&&score<=100)this.score=score;else System.out.println("Invalid score ignored: "+score);}
 public char getGrade(){if(score>=70)return 'A';if(score>=60)return 'B';if(score>=50)return 'C';if(score>=40)return 'D';return 'F';}
 @Override public String toString(){return name+" ("+score+", "+getGrade()+")";}
 public static void main(String[] args){Student[] students={new Student("Amina",78),new Student("Tunde",55),new Student("Ngozi",91),new Student("Chika",64),new Student("Emeka",42)};for(Student s:students)System.out.println(s);}
}
