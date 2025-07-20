import java.util.Scanner;
public class NestedLoopsPatternPractice3 {
    // print the star Triangle pattern
//            *
//            **
//            ***
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row and column: ");
        System.out.println("Rows = ");
        int row = sc.nextInt();
        System.out.println("Columns = ");
        int col = sc.nextInt();

        for (int i = 1; i<=row ; i++){
            for (int j = 1; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
