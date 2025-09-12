import java.util.Scanner;
import java.lang.Math;
//"Given an integer array ‘a’ sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order." ✅
class lec18b{
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int [] SqrArrSort(int [] arr){
        int i = 0;
        int j = arr.length-1;
        int [] ans = new int[arr.length];
        int k = arr.length-1;

        while (i<=j){
            if (Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k--] = arr[i] * arr[i];
                i++;
            }else {
                ans[k--] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
    }
}
public class returnSortedSquareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec18b obj = new lec18b();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        int [] ans = obj.SqrArrSort(arr);
        obj.printArray(ans);

    }
}
