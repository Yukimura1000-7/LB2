import java.util.Arrays;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Введите пять разных целых чисел:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Числа должны быть разными.");
                    scanner.close();
                    return;
                }
            }
        }

        Arrays.sort(numbers);

        int median = numbers[2];

        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
        System.out.println("Медиана: " + median);

        scanner.close();
    }
}