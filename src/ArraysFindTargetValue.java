import java.util.Scanner;

//Find those numbers in array whose sum is equal to target value x and return its no. occurance
class Arrayz{
    static void printArray(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void FindTargetVal(int[] arr,int x){
        int ans = 0;
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){      //Inner loop to add each number to i from i+1 to arr.length
                if (arr[i] + arr[j] == x){
                    ans++;
                }
            }
        }
        System.out.println("No. of Two numbers added to get"+" "+ x + " " +"is"+" "+ ans);
    }
}
public class ArraysFindTargetValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        Arrayz obj = new Arrayz();
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        obj.printArray(arr);
        System.out.println("Now set value for x: ");
        int x = sc.nextInt();
        obj.FindTargetVal(arr, x);

    }
}
