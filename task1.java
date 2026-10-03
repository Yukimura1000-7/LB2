import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }

        scanner.close();
    }
}