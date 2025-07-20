import java.util.Scanner;
public class NestedLoopsPatternPractice4 {
    // print the reverse star Triangle pattern
//            ***
//            **
//            *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row and column: ");
        System.out.println("Rows = ");
        int row = sc.nextInt();
        System.out.println("Columns = ");
        int col = sc.nextInt();

        for (int i = row; i>=0 ; i--){
            for (int j = 1; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
