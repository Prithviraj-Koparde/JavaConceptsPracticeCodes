import java.util.Scanner;

// Return n rows of pascals triangle
class lec21b{
    static void printArray(int [][] arr){
        for (int i =0 ; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascals(int n){
        int [][] ans = new int[n][];       // no value for column is know thats why it is kept empty

        for (int i=0; i<n; i++){
            // ith row has i+1 columns
            ans[i] = new int[i+1];

            //1st and lst ele of array is same
            ans[i][0] = ans[i][i] = 1;


            //main logic of code
            for (int j = 1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

}

public class PascalsTriangleMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec21b obj = new lec21b();
        System.out.println("Enter n value to get pascals triangle: ");
        int n = sc.nextInt();

        System.out.println("Your Pascals or jagged array");
        int [][] arr = obj.pascals(n);
        obj.printArray(arr);
    }
}
