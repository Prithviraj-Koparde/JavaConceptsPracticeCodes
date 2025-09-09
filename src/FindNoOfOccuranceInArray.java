//Find number of occurance of element x in an array and return the total occurance
// also find last occurance of an element
// and also find number of elements greater than value x

import java.util.Scanner;

public class FindNoOfOccuranceInArray {

    static void printArray(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void checkOccurance(int [] arr , int x){
        int occ = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] == x){
                occ++;
            }
        }
        System.out.println("Occurance of element"+" "+ x +" "+ "is" +" "+occ+ " " + "times");
    }

    static void lastOccurance(int [] arr, int x){
        int lastocc = -1;
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i] == x){
                lastocc = i;
            }
        }
        System.out.println("The element"+ " " + x + " " + "last occured at"+ " " + lastocc +"th" + " " + "position");
    }

    static void NofGreatEle(int [] arr, int x){
        int greaterNum = 0;
        for (int i = 0 ; i<arr.length; i++){
            if (x<arr[i]){
                greaterNum++;
            }
        }
        System.out.println("Number of greater numbers than"+" "+ x +" "+ "are" + " "+ greaterNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        printArray(arr);
        System.out.println();
        System.out.println("Now set a value for x element to check its occurance");
        int x = sc.nextInt();
        checkOccurance(arr, x);

        System.out.println("Now set value for y to check its last occurance in the array: ");
        int y = sc.nextInt();
        lastOccurance(arr, y);

        System.out.println("Now lets check how many elements are greater than element z enter its value: ");
        int z = sc.nextInt();
        NofGreatEle(arr, z);
    }
}
