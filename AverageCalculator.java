import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter how many numbers you want to average: ");
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += scanner.nextDouble();
        }

        double average = sum / n;
        System.out.println("\nThe average is: " + average);
        
        scanner.close();
    }
}