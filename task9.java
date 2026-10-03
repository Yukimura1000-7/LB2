
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите максимальное количество звёзд: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            printLine(i, n);
        }

        for (int i = 1; i <= n; i++) {
            printLine(i, n);
        }

        scanner.close();
    }

    static void printLine(int stars, int n) {

        for (int j = 0; j < n - stars; j++) {
            System.out.print(" ");
        }
        
        for (int j = 0; j < stars; j++) {
            if (j > 0) System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();
    }
}