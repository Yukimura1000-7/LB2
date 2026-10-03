import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите y: ");
        double y = scanner.nextDouble();

        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}