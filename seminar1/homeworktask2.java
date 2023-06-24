/**2) Вывод всех простых чисел от 1 до 1000:*/

public class Main {
    public static void main(String[] args) {
        // 2) Вывод всех простых чисел от 1 до 1000:
        int n = 1000;
        boolean[] numbers = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            numbers[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (numbers[i]) {
                for (int j = i * i; j <= n; j += i) {
                    numbers[j] = false;
                }
            }
        }

        System.out.print("Все простые числа от 1 до 1000: ");
        for (int i = 2; i <= n; i++) {
            if (numbers[i]) {
                System.out.print(i + " ");
            }
        }
    }
}