import java.util.Scanner;
public class NestedLoopsPatternPractice7 {

//    To print this pattern
//    123456
//    123456
//    123456
//    123456
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows and column to print a number rectangular pattern: ");
    System.out.print("Row: ");
    int row = sc.nextInt();
    System.out.print("Col: ");
    int col = sc.nextInt();

    for (int i=1; i<=row; i++){
        for (int j=1; j<=col; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
}
