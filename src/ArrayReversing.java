import java.util.Scanner;

// Reverse an array consisting of integers
class lec17a {
    static void RevArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    // another method
    static int[] RevArray1(int[] arr) {
        int j = 0;
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Another method which says that use in-place(jisme second memory nahi use karni hai swapping use karni hai og array me) approach
    static void swapArrayEle(int [] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void InPlaceReversing(int [] arr){
        int i = 0; int j = arr.length -1 ;
        while (i<j){
            swapArrayEle(arr, i, j);
            i++;
            j--;
        }
    }
}
public class ArrayReversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec17a obj = new lec17a();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        System.out.println("Reversed array is: " );
        obj.RevArray(arr);
        System.out.println();

        int [] ans = obj.RevArray1(arr);
        obj.printArray(ans);
        System.out.println();

        obj.InPlaceReversing(arr);
        obj.printArray(arr);
    }
}
