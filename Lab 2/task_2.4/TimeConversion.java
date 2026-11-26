
public class TimeConversion {
    public static void main(String[] args) {

        int totalSeconds = 10000;

        int hours = totalSeconds / 3600;

        int remainingSeconds = totalSeconds % 3600;

        int minutes = remainingSeconds / 60;

        int seconds = remainingSeconds % 60;

        System.out.println("TIME CONVERSION");
        System.out.println("----------------------");

        System.out.println("Total Seconds: " + totalSeconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
