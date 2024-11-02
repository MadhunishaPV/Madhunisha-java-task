import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int product = 1;

        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }

        System.out.println("Product of the digits: " + product);
        scanner.close();
    }
}
