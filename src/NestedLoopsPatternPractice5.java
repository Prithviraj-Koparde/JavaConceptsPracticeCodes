import java.util.Scanner;
public class NestedLoopsPatternPractice5 {
    // print the reverse star Triangle pattern
//              *
//             ***
//            *****
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row and column: ");
        System.out.println("Rows = ");
        int row = sc.nextInt();

        for (int i = 1; i <=row; i++){
            for (int j = 1; j<=row-i; j++ ){
                System.out.print(" ");
            }
            for (int k = 1 ; k<= 2*i-1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
