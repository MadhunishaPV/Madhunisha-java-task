import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        boolean isPrime = (number > 1);

        for (int i = 2; isPrime && (i * i <= number); i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        
        System.out.println("Is " + number + " a prime number? " + isPrime);
        scanner.close();
    }
}
