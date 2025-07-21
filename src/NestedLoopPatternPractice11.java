import java.util.Scanner;
public class NestedLoopPatternPractice11 {
//    print this pattern
//        1
//       2 2
//      3   3
//     4444444

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i<=row ; i++){
            for (int j = 1; j<=row-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == row || j == 1 || j == 2 * i - 1) {
                    System.out.print(i);  // Print number at boundaries or last row
                } else {
                    System.out.print(" ");  // Print space inside
                }
            }

            System.out.println();
        }

        sc.close();
    }
}

