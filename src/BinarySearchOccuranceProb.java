//Find the first occurrence of a given element x i.e index of element x,
// given that the given array is sorted. If no occurrence of x is found then return -1.

class lec45a {
    static int FirstOcc(int[] arr, int x) {
        int n = arr.length;
        int start = 0, end = n - 1, freqOccurance = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x == arr[mid]) {
                freqOccurance = mid;
                end = mid - 1;
            } else {
                if (x < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return freqOccurance;
    }

    //Find the last occurrence of a given element x i.e index of element x,
// given that the given array is sorted. If no occurrence of x is found then return -1.
    static int AltFirstOcc(int[] arr, int x) {
        int n = arr.length;

        int start = 0, end = n - 1, freqOccurance = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x == arr[mid]) {
                freqOccurance = mid;
                start = start + 1;
            } else {
                if (x < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return freqOccurance;
    }

}

public class BinarySearchOccuranceProb {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4, 4, 5, 6, 7, 8, 8};
        lec45a obj = new lec45a();

        System.out.println(obj.FirstOcc(arr, 3));
    }
}
