public static void generateArithmeticException() {
    int result = 10 / 0;
}

public static void generateArrayIndexOutOfBoundsException() {
    int[] array = new int[5];
    int element = array[10];
}

public static void generateNullPointerException() {
    String str = null;
    int length = str.length();
}

public static int[] calculateDifference(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
        throw new RuntimeException("Длины массивов не равны");
    }
    int[] result = new int[array1.length];
    for (int i = 0; i < array1.length; i++) {
        result[i] = array1[i] - array2[i];
    }
    return result;
}

public static int[] calculateQuotient(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
        throw new RuntimeException("Длины массивов не равны");
    }
    int[] result = new int[array1.length];
    for (int i = 0; i < array1.length; i++) {
        result[i] = array1[i] / array2[i];
    }
    return result;
}

public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};

    try {
        int[] difference = calculateDifference(array1, array2);
        System.out.println("Разность массивов: " + Arrays.toString(difference));
    } catch (RuntimeException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    try {
        int[] quotient = calculateQuotient(array1, array2);
        System.out.println("Частное массивов: " + Arrays.toString(quotient));
    } catch (RuntimeException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }
}