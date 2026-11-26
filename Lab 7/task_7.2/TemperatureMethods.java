public class TemperatureMethods {
 public static double celsiusToFahrenheit(double c){return c*9.0/5+32;}
 public static double fahrenheitToCelsius(double f){return (f-32)*5.0/9;}
 public static void main(String[] args){System.out.printf("%10s %15s%n","Celsius","Fahrenheit");for(int c=0;c<=100;c+=10)System.out.printf("%10d %15.1f%n",c,celsiusToFahrenheit(c));System.out.printf("68 F = %.1f C%n",fahrenheitToCelsius(68));}
}
