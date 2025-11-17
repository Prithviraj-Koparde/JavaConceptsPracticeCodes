class lec45 {
    static boolean BinSort(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;            // but this str + end can cause excedding out of int limit

            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    static boolean RecBinSort(int[] arr, int start, int end, int target) {
        // base case
        if (start > end) return false;

        // recursive case
        int mid = (start + end)/2;

        if (arr[mid] == target){
            return true;
        } else if (target> mid) {
            RecBinSort(arr, mid + 1, end, target);
        } else {
            RecBinSort(arr, start, mid-1, target);
        }
        return false;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        lec45 obj = new lec45();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 9;

        System.out.println(obj.BinSort(arr, target));       // by normal method call
        System.out.println(obj.RecBinSort(arr, 0, arr.length - 1, target)); // by recurison

    }
}
