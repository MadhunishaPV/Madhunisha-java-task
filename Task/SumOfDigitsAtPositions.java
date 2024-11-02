import java.util.Scanner;

public class SumOfDigitsAtPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if ((i + 1) % 2 != 0) {
                oddSum += digit;
            } else {
                evenSum += digit;
            }
        }

        System.out.println("Odd Position Sum: " + oddSum + ", Even Position Sum: " + evenSum);
        scanner.close();
    }
}
