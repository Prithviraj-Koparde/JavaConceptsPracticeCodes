import java.util.Scanner;

// print elements from a matrix in a spiral form
class lec22{
    static void printArray(int [][] arr){
        for (int i =0 ; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method for printing spiral output
    static void Spiral(int [][] a, int r, int c){
        int topRow =0, bottomRow = r-1 , leftcol = 0, rightcol = c-1;
        int totalEle = 0;
        while (totalEle < r*c){
            // printing top row > left col to right col
            for (int j = leftcol; j<=rightcol && totalEle<r*c ; j++){
                System.out.print(a[topRow][j] + "  ");
                totalEle++;
            }
            topRow++;

            // printing right col > toprow to bottomrow
            for (int i = topRow; i<=bottomRow && totalEle<r*c; i++){
                System.out.print(a[i][rightcol] + "  ");
                totalEle++;
            }
            rightcol--;

            // printing bottom row > left col to right col
            for (int j = rightcol; j>= leftcol && totalEle<r*c; j--){
                System.out.print(a[bottomRow][j] + "  ");
                totalEle++;
            }
            bottomRow--;

            //printing left column > bottom row to top row
            for (int i = bottomRow; i >= topRow && totalEle<r*c; i--){
                System.out.print(a[i][leftcol] + "  ");
                totalEle++;
            }
            leftcol++;
        }
    }
}


public class SpiralPatternTwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec22 obj = new lec22();
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
        obj.Spiral(a,r1,c1);

    }
}
