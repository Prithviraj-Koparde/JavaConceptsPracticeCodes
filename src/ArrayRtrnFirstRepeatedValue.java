import java.util.Scanner;

//Given an array ‘a’ consisting of integers.
// Return the first value that is repeating in this array. If no value is being repeated, return -1.
class lec16c{
    static int ReturnRepeatVal(int [] arr){
        int ans = -1;
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    ans = arr[i];
                    break;
                }
            }
        }
        return ans;
    }

    static void printArray(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class ArrayRtrnFirstRepeatedValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec16c obj = new lec16c();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        System.out.println("First repeated value in this array is" + " " + obj.ReturnRepeatVal(arr));

    }
}
