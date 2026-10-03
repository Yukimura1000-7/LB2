import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        System.out.println("Степени 2, не превышающие " + n + ":");
        for (int p = 1; p <= n; p *= 2) {
            System.out.println(p);
        }

        scanner.close();
    }
}