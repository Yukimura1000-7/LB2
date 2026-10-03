import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное целое число n: ");
        int n = scanner.nextInt();

        String s = Integer.toString(n);

        System.out.println("Число как строка: " + s);
        System.out.println("Длина строки: " + s.length());
        System.out.println("Первый символ: " + s.charAt(0));

        scanner.close();
    }
}