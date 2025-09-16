import java.util.Scanner;

//Rotate the matrix by 90 degrees means 1 roll to the right
class lec21a{
    static void printArray(int [][] arr){
        for (int i =0 ; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Logic for matrix rotation is to 1st convert matrix to transpose matrix then reverse each row of that transpose matrix for result
    //Transpose of matrix method for rotation of matrix

    static void transposeMar(int [][] arr,int r, int c ){
        for (int i = 0; i<c; i++){
            for (int j=i; j<r; j++){    // NOTE HERE j should run from i other wise the array will be printed as it is
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverse(int []arr){
        int i=0, j=arr.length-1;
        while (i<j){
            int temp = arr[i];   // giving 1d ith array to reverse function
            arr[i] = arr[j];
            arr[j] =  temp;
            i++;
            j--;
        }
    }
    static void RotateMat(int [][] arr, int n){
        transposeMar(arr,n,n);              // transpose call
        for (int i = 0; i<n; i++){
            reverse(arr[i]);
        }
    }
}
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec21a obj = new lec21a();
        System.out.println("Enter rows and columns for the matrices: ");
        System.out.println("Enter rows and columns for mat A");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] a = new int[r1][c1];

        for (int i = 0 ; i<r1 ; i++){
            for (int j = 0; j<c1; j++){
                System.out.println("Enter value: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered array is: ");
        obj.printArray(a);

        System.out.println("Rotated array: ");
        obj.RotateMat(a,r1);
        obj.printArray(a);
    }
}
