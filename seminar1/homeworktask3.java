/*3) Реализация простого калькулятора:*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3) Реализация простого калькулятора:
        System.out.println("Калькулятор (для выхода введите q)");
        while (true) {
            System.out.print("Введите первое число: ");
            String input = scanner.next();
            if (input.equals("q")) {
                break;
            }
            if (!input.matches("\\d+")) {
                System.out.println("Ошибка: неверный формат числа");
                continue;
            }
            int a = Integer.parseInt(input);

            System.out.print("Введите второе число: ");
            input = scanner.next();
            if (input.equals("q")) {
                break;
            }
            if (!input.matches("\\d+")) {
                System.out.println("Ошибка: неверный формат числа");
                continue;
            }
            int b = Integer.parseInt(input);

            System.out.print("Введите знак операции (+, -, *, /): ");
            input = scanner.next();
            if (input.equals("q")) {
                break;
            }
            if (!(input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/"))) {
                System.out.println("Ошибка: неверный формат операции");
                continue;
            }

            int result;
            switch (input) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Ошибка: деление на ноль");
                        continue;
                    }
                    result = a / b;
                    break;
                default:
                    result = 0;
            }

            System.out.printf("Результат: %d\n", result);
        }
    }
}