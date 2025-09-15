import java.util.Scanner;

//Add two matrices and print answer matrix note that both matrices should be of same dimensions
class lec20{
    static void printArray(int [][] matrix){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]+ " ");
            }
        }
    }

    static int[][] addMat(int [][] matrix1, int r1 , int c1, int [][] matrix2){
        int [][] sum = new int[r1][c1];
        for (int i =  0; i<r1 ; i++){
                for (int j = 0; j<c1; j++){
                    sum [i][j] = matrix1[i][j] + matrix2[i][j];
                }
        }
        return sum;
    }
}

public class TwoDArraysAddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for two matrices: ");
        System.out.println("Rows of matrix A: ");
        int r1 = sc.nextInt();
        System.out.println("Columns of matrix A: ");
        int c1 = sc.nextInt();
        System.out.println("Rows of matrix B: ");
        int r2 = sc.nextInt();
        System.out.println("Columns of matrix B: ");
        int c2 = sc.nextInt();
        int [][] m1 = new int[r1][c1];
        int [][] m2 = new int[r2][c2];
        lec20 obj = new lec20();

        if (r1 == r2 && c1 == c2){
            System.out.println("Enter elements for A");
            for (int i = 0 ; i<r1; i++){
                for (int j = 0; j<c1; j++){
                    System.out.println("Enter value: ");
                    m1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements for A");
            for (int i = 0 ; i<r2; i++){
                for (int j = 0; j<c2; j++){
                    System.out.println("Enter value: ");
                    m2[i][j] = sc.nextInt();
                }
            }
        }else{
            System.out.println("Enter same dimensions for both matrices");
        }
        obj.printArray(m1);
        obj.printArray(m2);

        int [][] ans = obj.addMat(m1 ,r1, c1, m2);
        obj.printArray(ans);
    }
}
