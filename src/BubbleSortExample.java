import java.util.Arrays;

public class BubbleSortExample {
    static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {

                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] randomArray = {44, 5, 11, 4, 99, 100, 3, 0, 55};

        System.out.println("Array before bubble sort:");
        System.out.println(Arrays.toString(randomArray));
        bubbleSort(randomArray);
        System.out.println("Array after bubble sort:");
        System.out.println(Arrays.toString(randomArray));
    }
}
