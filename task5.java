public class task5{
    public static void main(String[] args) {
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++){
            System.out.println(f);
            f = f + g;
            g = f - g;
        }

    }
}

// Закономерность: каждое следующее число равно сумме двух предыдущих.
// Название: последовательность Фибоначчи.