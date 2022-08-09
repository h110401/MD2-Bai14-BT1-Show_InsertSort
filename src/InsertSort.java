import java.util.Arrays;

public class InsertSort {

    static int[] list = {9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0};

    public static void insertionSort(int[] array) {
        int pos, x;
        System.out.println(Arrays.toString(list));
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println(Arrays.toString(list));
            }
            array[pos] = x;
            System.out.println(Arrays.toString(list));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }

}
