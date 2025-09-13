import java.util.Scanner;

// given an array a return the prefix sum/ running sum in an array
class lec19{
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] PrefixSum(int [] arr){
        int [] pref = new int[arr.length];
        pref[0] = arr[0];

        for (int i = 1; i<arr.length; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    // in place (without creating an extra array make change in same array)
    static int [] InplacePrefixSum(int [] arr){
        for (int i = 1; i< arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}

public class PrefixSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec19 obj = new lec19();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        System.out.println("The prefix sum of given array is: ");
        int [] ans = obj.PrefixSum(arr);
        obj.printArray(ans);
        System.out.println();

        int [] pref = obj.InplacePrefixSum(arr);
        obj.printArray(pref);
    }
}
