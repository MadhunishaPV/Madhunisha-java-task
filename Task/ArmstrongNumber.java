import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;

        int numberOfDigits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10; 
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        boolean isArmstrong = (sum == originalNumber);
        System.out.println("Is the number an Armstrong number? " + isArmstrong);
        
        scanner.close();
    }
}
