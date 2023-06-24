/*4) Восстановление уравнения q + w = e:*/


public class Main {
    public static void main(String[] args) {
        // 4) Восстановление уравнения q + w = e:
        boolean foundSolution = false;
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                int eq = 20 + q;
                int ew = 60 + w * 10 + 5;
                if (eq == ew) {
                    System.out.printf("Выражение: 2%d + %d5 = %d\n", q, w, ew);
                    foundSolution = true;
                    break;
                }
            }
            if (foundSolution) {
                break;
            }
        }
        if (!foundSolution) {
            System.out.println("Решения нет");
        }
    }
}                    