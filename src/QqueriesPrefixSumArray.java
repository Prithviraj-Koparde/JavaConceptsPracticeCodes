import java.util.Scanner;

//Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from l to r (both included).
//Note: The values of l and r in queries follow 1-based indexing. 1 based indexing means array index starts from 1 not 0
class lec19a{
    static void printArray(int[] arr) {
        for (int i = 1; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int [] QueryPrefixSum(int [] arr){
        for (int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}

public class QqueriesPrefixSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec19a obj = new lec19a();
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter elements in array: ");
        for (int i = 1; i <=n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        int [] pref = obj.QueryPrefixSum(arr);          // calling prefix function once to improve T & S COMPLEXITY
        System.out.println("Enter number of queries: ");
        int queries = sc.nextInt();
        int i=0;
        while (i<queries) {
            System.out.println("Enter left index and right index: ");
            int left = sc.nextInt();
            int right = sc.nextInt();

            int answ = pref[right] - pref[left-1];
            System.out.println("Sum is " + answ);
            i++;
        }

    }
}

