class Student {
 private static int count=0; private String name;
 public Student(String name){this.name=name;count++;}
 public static int getCount(){return count;}
 public String toString(){return name;}
}
public class StudentCounter {
 public static void main(String[] args){Student a=new Student("Amina"),b=new Student("Tunde"),c=new Student("Ngozi");System.out.println(a+", "+b+", "+c);System.out.println("Objects created: "+Student.getCount());}
}
