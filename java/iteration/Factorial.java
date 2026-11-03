import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.printf("%d! = %d", n, fact);

    }
}