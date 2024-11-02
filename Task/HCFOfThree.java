import java.util.Scanner;

public class HCFOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int hcf = hcf(a, hcf(b, c));
        
        System.out.println("HCF: " + hcf);
        scanner.close();
    }

    public static int hcf(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
