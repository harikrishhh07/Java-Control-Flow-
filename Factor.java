import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        if (n >= 0) {
            long factorial = 1;
            int i = 1;
            
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The entered number is not a positive integer.");
        }
        
        scanner.close();
    }
}