import java.util.Scanner;

//Find second maximum element in array and return it note that same number input is not allowed and negative nums can be entered in array
class lec16b{
    static int FindMaxEle(int[] arr){       // this method will give us largest element in array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];               // this will set max which is -infinity to largest ele in array
            }
        }
        return max;
    }

    static int DeleteFirstMax(int [] arr){          // this method will replace 1st max value with -infinity i.e Min_VALUE
        int max = FindMaxEle(arr);

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = FindMaxEle(arr);     // After replacing 1st max value to MIN_VALUE its time for traversing array again to find current largest ele
        return secondMax;
    }

    static void printArray(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

public class ArrayFindSecondMaxVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec16b obj = new lec16b();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        System.out.println("First largest element in array is :"+ " "+ obj.FindMaxEle(arr));
        System.out.println("But we want second largest element");
        System.out.println("So Second largest element in array is :"+ " "+ obj.DeleteFirstMax(arr));
    }
}
