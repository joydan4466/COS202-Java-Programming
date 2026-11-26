public class Rectangle {
 private double length,width;
 public Rectangle(double length,double width){this.length=length;this.width=width;}
 public double getLength(){return length;} public double getWidth(){return width;}
 public double area(){return length*width;} public double perimeter(){return 2*(length+width);}
 public static void main(String[] args){Rectangle r1=new Rectangle(5,3),r2=new Rectangle(8,4);show(r1);show(r2);}
 private static void show(Rectangle r){System.out.printf("Length=%.2f Width=%.2f Area=%.2f Perimeter=%.2f%n",r.getLength(),r.getWidth(),r.area(),r.perimeter());}
}
