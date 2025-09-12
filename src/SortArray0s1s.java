import java.util.Scanner;

//sort array consisting of 0's and 1's
class lec18{
    // multiple loops approach
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

    // Single loop approach
    static void swap(int [] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void sortWithOneLoop(int [] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
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

//        System.out.println("Sorted array is: ");
//        obj.sort(arr);
//        obj.printArray(arr);

        System.out.println();
        System.out.println("Sort array with single loop");
        obj.sortWithOneLoop(arr);
        obj.printArray(arr);
    }
}
