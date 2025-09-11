import java.util.Scanner;

// Revers an array consisting of integers
class lec17a{
    static void RevArray(int [] arr){
        for (int i = arr.length-1 ; i>=0 ; i--){
            System.out.print(arr[i] + " ");
        }

    }

    // another method
    static int [] RevArray1(int [] arr){
        int j = 0;
        int [] ans = new int[arr.length];
        for (int i = arr.length-1; i>=0; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void printArray(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
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
    }
}
