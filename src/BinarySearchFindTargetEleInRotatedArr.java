// Find target value in rotated array

class lec46a {
    static int FindTarget(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            // If right half is sorted
            if (arr[mid] <= arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // Left half is sorted
            else {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}

public class BinarySearchFindTargetEleInRotatedArr {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int ans = lec46a.FindTarget(arr, 5);
        System.out.println(ans);
    }
}
