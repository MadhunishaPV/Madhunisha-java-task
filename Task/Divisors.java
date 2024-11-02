import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        StringBuilder divisors = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.append(i).append(", ");
            }
        }
        
        if (divisors.length() > 0) {
            divisors.setLength(divisors.length() - 2);
        }
        System.out.println("Divisors: " + divisors);
        scanner.close();
    }
}
