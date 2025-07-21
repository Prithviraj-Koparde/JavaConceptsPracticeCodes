import java.util.Scanner;
public class NestedLoopsPatternPractice8 {

//    print this pattern
//    12345
//    1   5
//    1   5
//    12345
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter col: ");
        int col = sc.nextInt();

        for (int i=1; i<=row; i++){
            for (int j=1; j<=col; j++){
                if (i==1 || i==row || j==1 || j==col){ // Main logic bruh
                    System.out.print(j);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
