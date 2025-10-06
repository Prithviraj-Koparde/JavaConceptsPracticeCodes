import java.lang.Math;

// print array elements recursively
// print max value in array
// Print sum of all elements of array
class lec32 {
    static void PrintArr(int[] arr, int index) {
        int n = arr.length;
        // base case
        if (n == 0 || index == n) return;
        //self work
        System.out.println(arr[index]);
        // recursive case
        PrintArr(arr, index + 1);
    }

    static int PrintMax(int[] arr, int idx) {
        int n = arr.length;
        //base case
        if (idx == n - 1) return arr[idx];
        // recursive case
        int smallAns = PrintMax(arr, idx + 1);
        // self work
        return Math.max(arr[idx], smallAns);
    }

    static int Sum(int[] arr, int idx) {
        int n = arr.length;
        //base case
        if (idx == n) return 0;
        //recursive case
        int smallAns = Sum(arr, idx + 1);
        // self work
        return smallAns + arr[idx];
    }
}

public class PrintArrEleRecursively {
    public static void main(String[] args) {
        lec32 obj = new lec32();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        obj.PrintArr(arr, 0);
        System.out.println("MAXIMUM ELEMENT IN ARRAY IS " + obj.PrintMax(arr, 0));
        System.out.println(obj.Sum(arr, 0));
    }
}
