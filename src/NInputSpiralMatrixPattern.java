import java.util.Scanner;

// print a 2d matrix of n*n dimension on input n in this matrix element should be form 1 to n*n or n^2
class lec22a{
    static void printArray(int [][] arr){
        for (int i =0 ; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // spiral pattern matrix input method
    static int[][] printMatrix(int n){
        int [][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftcol = 0 , rightcol = n-1;
        int currentval = 1;

        while (currentval<=n*n){
            for (int j = leftcol; j<=rightcol && currentval<=n*n; j++){
                matrix[topRow][j] = currentval;
                currentval++;
            }
            topRow++;

            for (int i = topRow; i<=bottomRow && currentval<=n*n; i++){
                matrix[i][rightcol] = currentval;
                currentval++;
            }
            rightcol--;

            for (int j = rightcol; j>=leftcol && currentval<=n*n; j--){
                matrix[bottomRow][j] = currentval;
                currentval++;
            }
            bottomRow--;

            for (int i = bottomRow; i>=topRow && currentval<=n*n; i--){
                matrix[i][leftcol] = currentval;
                currentval++;
            }
            leftcol++;
        }
        return matrix;
    }
}

public class NInputSpiralMatrixPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec22a obj = new lec22a();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int [][] matrix = obj.printMatrix(n);
        obj.printArray(matrix);
    }
}
