import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};
        bubbleSort(arr, "log.txt");
        // Результат: [1, 2, 4, 5, 8] (записан в файл log.txt)
    }

    public static void bubbleSort(int[] arr, String logFileName) {
        try (FileWriter log = new FileWriter(logFileName)) {
            int n = arr.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                log.write("Iteration " + (i + 1) + ": " + Arrays.toString(arr) + "\n");
                if (!swapped) {
                    break;
                }
            }
            log.write("Sorted array: " + Arrays.toString(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}