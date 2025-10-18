// sort an array using bubble sort algorithm

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 4, 0, 1, 1, 1};
        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
