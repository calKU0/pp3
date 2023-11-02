import java.util.Scanner;

public class Midnight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        scanner.close();

        int totalMinutes = hours * 60 + minutes;
        int totalSeconds = totalMinutes * 60;

        System.out.printf("The time is: %02d:%02d%n", hours, minutes);

        System.out.println("Number of minutes since midnight: " + totalMinutes);
        System.out.println("Number of seconds since midnight: " + totalSeconds);
    }
}