import java.util.Scanner;

//Find the unique number in a given Array where all the elements are being repeated twice with one value being unique.
//Only positive number are in array
class lec16a{
    static void printArray(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void Uniquevalue(int [] arr){

        for (int i = 0; i<arr.length; i++){     // loop to traverse array from first number
            for (int j = i+1; j<arr.length; j++){   // loop to traverse array from next number to first
                if (arr[i] == arr[j]){
                    arr[i] = -1;            // this will make the current ith index value -1
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0 ; i<arr.length; i++){    // loop for finding out unique value other than -1
            if (arr[i]>-1){
                System.out.println("Unique value in array is"+" "+arr[i]);
            }
        }
    }
}
public class UniqueNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec16a obj = new lec16a();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        obj.Uniquevalue(arr);
    }
}
