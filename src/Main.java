import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the entered number.
        Scanner scanner = new Scanner(System.in);

        // Stores the entered number.
        int number = scanner.nextInt();

        // Checks if number is positive.
        if (number > 0) {
            System.out.println("The number entered is positive");
        } else {
            System.out.println("The number entered is negative");
        }
    }
}