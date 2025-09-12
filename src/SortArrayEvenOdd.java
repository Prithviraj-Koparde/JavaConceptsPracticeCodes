import java.util.Scanner;

//sort the array in such a way in which startin of array contains all even numbers then remaining odd numbers
class lec18a{
    static void swap(int [] arr , int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] =temp;
    }

    static void sortArray(int [] arr){
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            if (arr[left]%2!=0 && arr[right]%2 ==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left]%2 == 0){
                left++;
            }

            if (arr[right]%2 != 0){
                right--;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class SortArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec18a obj = new lec18a();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        obj.sortArray(arr);
        obj.printArray(arr);

    }
}
