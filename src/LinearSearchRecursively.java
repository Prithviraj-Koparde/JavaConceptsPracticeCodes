// return true if target is present in array else return false
// Now return the first index of that target if present else print -1
// now return all indices of target if present else return
class lec33 {
    // 1
    static boolean LinearSearch(int[] arr, int target, int idx) {
        int n = arr.length;
        // Base case
        if (idx == n) return false;
        //self work
        if (arr[idx] == target) return true;
        // Recursive case
        return LinearSearch(arr, target, idx + 1);
    }

    // 2
    static int LinearSearch1(int [] arr, int target , int idx){
        int n = arr.length;
        // Base case
        if (idx==n) return -1;
        // Self work
        if (arr[idx]==target) return idx;
        // Recursive case
        return LinearSearch1(arr,target,idx+1);
    }

    // 3
    static void FindAllIdx(int [] arr, int target, int idx){
        int n = arr.length;
        // Base case
        if (idx==n){
            return;
        }
        // Self work
        if (arr[idx]==target){
            System.out.print(idx + " ");
        }
        // Recursive case
        FindAllIdx(arr,target,idx+1);
    }
}

public class LinearSearchRecursively {
    public static void main(String[] args) {
        lec33 obj = new lec33();
        int[] arr = {1, 2, 3, 4,4,4, 5, -4, -9, -8, 8, 9, 10, -10};

        if (obj.LinearSearch(arr, -2, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(obj.LinearSearch1(arr,9,0));
        System.out.print("Indices of target: ");
        obj.FindAllIdx(arr,4,0);
    }
}
