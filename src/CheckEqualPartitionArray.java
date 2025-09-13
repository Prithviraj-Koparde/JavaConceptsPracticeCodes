import java.util.Scanner;

//program to check if an array can be partitioned with eqaul sum
class lec19b{
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int TotalSum(int[] arr){
        int totalSum = 0;
        for (int i =0; i<arr.length;i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean CheckPartition(int [] arr){
        int TotalSum = TotalSum(arr);
        int PrefixSum = 0;
        for (int i =0; i<arr.length; i++){
            PrefixSum += arr[i];
            int SuffixSum = TotalSum - PrefixSum;
            if (PrefixSum == SuffixSum){
                return true;
            }
        }
        return false;
    }

}

public class CheckEqualPartitionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec19b obj = new lec19b();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        System.out.println("Array equally partioned: " + obj.CheckPartition(arr));
    }
}
