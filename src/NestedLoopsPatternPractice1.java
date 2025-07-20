import java.util.Scanner;
// print the star rectangular pattern
public class NestedLoopsPatternPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row and column: ");
        System.out.println("Rows = ");
        int row = sc.nextInt();
        System.out.println("Columns = ");
        int col = sc.nextInt();
        for (int i = 1 ; i<=row; i++){
            for (int j = 1 ; j<=col ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
