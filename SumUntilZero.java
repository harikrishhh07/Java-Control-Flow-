import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while (true) {
            number = scanner.nextDouble();
            if (number == 0) {
                break;
            }
            total += number;
        }
        System.out.println("Total sum: " + total);
        scanner.close();
    }
}