import java.util.Scanner;

// Given a matrix ‘a’ of dimension n x m and 2 coordinates (l1, r1) and (l2, r2). Return the sum of the rectangle from (l1, r1) to (l2, r2).
// conditions are l2>-l1 and r2>=r1
//                0<=l1,l2>=n or r
//                0<=r1,r2>=n or c
class lec23{
    static void printArray(int [][] arr){
        for (int i =0 ; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Brute Force Method
    static int RectangleSum(int [][] arr, int l1, int r1, int l2, int r2){
        int ans = 0;
        for (int i = l1; i<=l2; i++){
            for (int j = r1; j<=r2; j++){
                ans += arr[i][j];
            }
        }
        return ans;
    }

    // 2nd better method insted traversing matrix everytime
    static void PrefixMatrix(int [][] arr){
        int r = arr.length;
        if (r == 0) return;
        int c = arr[0].length;          // note that this line will give an error if user gives r value as 0 means no row
        // traverse row wise to calculate prefix of that row
        for (int i = 0; i<r; i++){
            for (int j = 1; j<c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
    }
    static int RectangleSum2(int [][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;
        PrefixMatrix(arr);
        for (int i = l1; i<= l2; i++){
            sum += arr[i][r2] - arr[i][r1-1];
        }
        return sum;
    }
}

public class ReturnSumOfRectangleInTwoDMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec23 obj = new lec23();
        System.out.println("Enter rows and columns for the matrices: ");
        System.out.println("Enter rows and columns for matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] a = new int[r][c];

        for (int i = 0 ; i<r ; i++){
            for (int j = 0; j<c; j++){
                System.out.println("Enter value: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your Matrix is: ");
        obj.printArray(a);

        System.out.println("Enter l1: ");
        int l1 = sc.nextInt();
        System.out.println("Enter r1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter l2: ");
        int l2 = sc.nextInt();
        System.out.println("Enter r2: ");
        int r2 = sc.nextInt();

        int ans = obj.RectangleSum(a,l1,r1,l2,r2);
        System.out.println(ans);

        int ans1 = obj.RectangleSum2(a,l1,r1,l2,r2);
        System.out.println(ans1);
    }
}
