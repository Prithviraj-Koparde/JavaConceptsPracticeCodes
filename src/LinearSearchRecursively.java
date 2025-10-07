// return true if target is present in array else return false
class lec33 {
    static boolean LinearSearch(int[] arr, int target, int idx) {
        int n = arr.length;
        // Base case
        if (idx == n) return false;
        //self work
        if (arr[idx] == target) return true;
        // Recursive case
        return LinearSearch(arr, target, idx + 1);
    }
}

public class LinearSearchRecursively {
    public static void main(String[] args) {
        lec33 obj = new lec33();
        int[] arr = {1, 2, 3, 4, 5, -4, -9, -8, 8, 9, 10, -10};

        if (obj.LinearSearch(arr, -2, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
