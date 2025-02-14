public class TestSum {
    public static void main(String[] args) {
        // Инициализировать sum
        float sum = 0;
        // Прибавить 0.01, 0.02, ..., 0.99, 1 к sum
        for (int i = 1; i <= 100; ++i) sum += 0.01f * i;
        // Отобразить sum
        System.out.println("Сумма равна " + sum);
    }
}
