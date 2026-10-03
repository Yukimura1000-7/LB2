public class task4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double r = Math.random();
            System.out.println(r);
            sum += r;
        }
        System.out.println("Среднее: " + (sum / n));
    }
}