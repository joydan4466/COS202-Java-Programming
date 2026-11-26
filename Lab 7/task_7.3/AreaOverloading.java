public class AreaOverloading {
 public static int area(int side){return side*side;}
 public static int area(int length,int width){return length*width;}
 public static double area(double radius){return Math.PI*radius*radius;}
 public static void main(String[] args){System.out.println("Square area: "+area(5));System.out.println("Rectangle area: "+area(5,8));System.out.printf("Circle area: %.2f%n",area(3.0));}
}
