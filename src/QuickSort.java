// quickSort
class lec41a {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int str, int end) {
        int pivot = arr[str];

        int count = 0;
        for (int i = str + 1; i <= end; i++) {
            if (arr[i] <= pivot) count++;
        }


        int pivotIdx = str + count;
        swap(arr, str, pivotIdx);
        int i = str, j = end;

        // element lesser on left side & elements greater on right side
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    public void sort(int[] arr, int str, int end) {
        if (str >= end) return;

        int pivot = partition(arr, str, end);

        sort(arr, str, pivot - 1);
        sort(arr, pivot + 1, end);
    }
}

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 6, 9, 1};
        lec41a obj = new lec41a();
        System.out.println("Before quick sort..");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("After quick sort..");
        obj.sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
