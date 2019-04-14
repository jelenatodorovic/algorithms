/**
 * @author jtodorovic, @date 4/11/2019
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 6};
        int[] b = insertionSort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    public static int[] insertionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        return a;
    }

}
