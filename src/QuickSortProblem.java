// place all the 0's at the end dont change the order of non zero elements
// use bubble sort approach
class lec39a {
    static void Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0 /* or j=i */; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true;
                }
            }
            if (!flag) return;
        }
    }
}

public class QuickSortProblem {
    public static void main(String[] args) {
        int[] arr = {0, 3, 0, 4, 0, 0, 34, 9};
        lec39a obj = new lec39a();
        obj.Sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
