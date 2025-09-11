import java.util.Scanner;

// Rotate the array with k steps note that k should not be a negative number and also do it with in-place approach
class lec17b{
    static int [] RotateArr(int[] arr, int k){
        int n = arr.length;
        k = k%n;                    // to keep the number of rotations easy if not understand go to lec17 time 48.18
        int [] ans = new int[n];
        int j = 0;

        for (int i = n-k; i<n; i++){
            ans[j++] = arr[i];
        }

        for (int i = 0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // InPlace Array Reverse
    static void reverse(int [] arr, int start, int last){
        while(start < last){
            swapArrayEle(arr, start, last);
            start++;
            last--;
        }
    }
    static void swapArrayEle(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void InplaceRotateArr(int [] arr, int k){
        k = k% arr.length;

        reverse(arr, 0, arr.length-k-1);
        reverse(arr , arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
}
public class ArrayRotatePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec17b obj = new lec17b();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        System.out.println("Enter value for k to rotate the array k times");
        int k = sc.nextInt();

        int [] a = obj.RotateArr(arr, k);
        obj.printArray(a);

        System.out.println("Enter value for k to rotate the array k times with inPlace approach");
        int j = sc.nextInt();

        obj.InplaceRotateArr(arr, j);
        obj.printArray(arr);

    }
}
