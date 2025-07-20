import java.util.Scanner;
public class NestedLoopsPatternPractice2 {
    // print the star rectangular pattern
//            *****
//            *   *
//            *****
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of row and column: ");
            System.out.println("Rows = ");
            int row = sc.nextInt();
            System.out.println("Columns = ");
            int col = sc.nextInt();


            for (int i = 1 ; i<=row; i++){
                for (int j = 1 ; j<=col ; j++){
                    if (i==1 || i==row || j==1 || j==col)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }


    }


