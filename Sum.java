import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;
            int i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumLoop);
            
            if (sumFormula == sumLoop) {
                System.out.println("Both computations match. The result is correct.");
            } else {
                System.out.println("There is a mismatch in computations.");
            }
        } else {
            System.out.println("The entered number is not a natural number.");
        }
        
        scanner.close();
    }
}