class lec41 {

    public void displayArr(int[] arr) {
        for (int val : arr) System.out.println(val);
    }

    public void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;

        // filling left and right arrays
        for (i = 0; i < n1; i++) left[i] = arr[l + i];
        for (j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];

        // sorting arrays and placing them to og array
        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }

        // abhi aisa kuch ho sakta hai ki koi ek index piche choot gaya ho to uske baad ki values direct og arr me fill karna hai
        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }

    public void Sort(int[] arr, int l, int r) {
        int mid = (l + r) / 2;
        // base case
        if (l >= r) return;

        // recursive case
        Sort(arr, l, mid);
        Sort(arr, mid + 1, r);

        //self work
        merge(arr, l, mid, r);      // calling fun to merge them
    }

}

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 2, 8, 2, 6};
        lec41 obj = new lec41();

        System.out.println("Before sorting: ");
        obj.displayArr(arr);

        System.out.println();
        System.out.println("After sorting: ");
        obj.Sort(arr, 0, arr.length - 1);
        obj.displayArr(arr);
    }
}
