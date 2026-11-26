class ValidatedStudent {
 private String name; private int score;
 ValidatedStudent(String name,int score){this.name=name;setScore(score);}
 public void setName(String name){if(name!=null&&!name.isBlank())this.name=name;else System.out.println("Invalid name rejected");}
 public void setScore(int score){if(score>=0&&score<=100)this.score=score;else System.out.println("Invalid score rejected: "+score);}
 public String toString(){return name+" - "+score;}
}
public class Validation {
 public static void main(String[] args){ValidatedStudent s=new ValidatedStudent("Ada",75);System.out.println(s);s.setScore(-5);s.setName("");System.out.println(s);}
}
