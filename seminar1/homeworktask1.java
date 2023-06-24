/*1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Вычисление n-ого треугольного числа:
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        int tn = n * (n + 1) / 2;
        System.out.printf("n-ое треугольное число: %d\n", tn);

        // 2) Вычисление факториала числа n:
        System.out.print("Введите n: ");
        n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.printf("Факториал числа %d: %d\n", n, fact);
    }
}