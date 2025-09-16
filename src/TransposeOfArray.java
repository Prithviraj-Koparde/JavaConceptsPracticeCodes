import java.util.Scanner;
// Return the transpose of given matrix
class lec21{
    static void printArray(int [][] arr){
        for (int i =0 ; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

// No inplace approach
    static int [][] FindTranspose(int [][] arr, int r, int c){
        int [][] ans = new int[c][r];

        for (int i = 0 ; i<c; i++){
            for (int j=0 ; j<r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    // inplace approach
    // this method is only correct for metrix with same diagonal even after transpose
    static void InplaceTranspose(int [][] arr , int r, int c){
        for (int i = 0; i<c; i++){
            for (int j = i; j<r; j++){    // NOTE HERE j should run from i other wise the array will be printed as it is
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
public class TransposeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec21 obj = new lec21();
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

//        System.out.println("Transpose without inplace");
//        int [][] ans = obj.FindTranspose(a , r1, c1);
//        obj.printArray(ans);

        System.out.println("Transpose using inplace approach: ");
        obj.InplaceTranspose(a,r1,c1);
        obj.printArray(a);
    }
}
