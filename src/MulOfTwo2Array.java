import java.util.Scanner;

// Multiply two arrays
class lec20a{
    static void printArray(int [][] matrix){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0 ; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void mulArray(int [][] a, int r1 , int c1, int [][] b, int r2 , int c2){
        if (c1 != r2){
            System.out.println("Multiplication not possible enter correct dimensions");
            return;
        }

        int [][] mul = new int[r1][c2];
        for (int i = 0; i<r1; i++){
            for (int j = 0; j<c2; j++){
                // for multiplying two elements from two diff arrays
                for (int k = 0; k<c2; k++){
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplied arrays: ");
        printArray(mul);
    }
}
public class MulOfTwo2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec20a obj = new lec20a();
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

        System.out.println("Enter rows and columns for the matrices: ");
        System.out.println("Enter rows and columns for mat B");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] b = new int[r2][c2];

        for (int i = 0 ; i<r2 ; i++){
            for (int j = 0; j<c2; j++){
                System.out.println("Enter value: ");
                b[i][j] = sc.nextInt();
            }
        }
        obj.printArray(a);
        obj.printArray(b);


        obj.mulArray(a, r1, c1, b, r2,c2);
    }
}
