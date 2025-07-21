import java.util.Scanner;
public class NestedLoopPatternPractice {
//    To print this pattern
//    1
//    12
//    123
//    1234
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows: ");
    int row = sc.nextInt();
    System.out.print("Enter Columns: ");
    int col = sc.nextInt();

    for (int i = 1 ; i<=row ; i++){
        for (int j = 1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
}
