import java.util.Scanner;

//sort array consisting of 0's and 1's
class lec18{
    static void sort(int [] arr){
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] ==0){
                count++;
            }
        }

        for (int i = 0; i<arr.length; i++){
            if(i < count){
                arr[i] = 0;
            }else {
                arr[i]= 1;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class SortArray0s1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec18 obj = new lec18();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        System.out.println("Sorted array is: ");
        obj.sort(arr);
        obj.printArray(arr);
    }
}
