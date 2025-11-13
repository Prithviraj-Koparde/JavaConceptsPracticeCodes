// Find the index of minimum element in the rotated array
// for ex:- {4,5,1,2,3} o/p:- 2 which is index of element 1
class lec46 {
    static int findMinimum(int[] arr) {
        int n = arr.length, ans = -1, start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}

public class BinarySearchFindSmallestEleInRotatedArr {
    public static void main(String[] args) {
        lec46 obj = new lec46();
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println("Index of smallest element:- " + obj.findMinimum(arr));
    }
}
