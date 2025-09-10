import java.util.Scanner;

//Find triplet numbers whose sum is equal to target value
class lec16{
    static void printArray(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void TripletSum(int [] arr, int x){
        int ans = 0;
        for (int i =0; i<arr.length; i++){ //will find 1st number
            for (int j = i+1; j< arr.length; j++){  //will find 2nd number
                for (int k = j+1; k< arr.length; k++){  //will find 3rd number
                    if (arr[i] + arr[j] + arr[k] == x){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

public class TripletTargetSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        lec16 obj = new lec16();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println();

        System.out.println("Set value for x: ");
        int x = sc.nextInt();
        obj.TripletSum(arr, x);
    }
}
