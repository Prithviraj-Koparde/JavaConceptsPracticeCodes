import java.util.Scanner;
public class NestedLoopsPatternPractice9 {
//    Print this pattern
//    121212
//    212121
//    121212
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row: ");
    int row = sc.nextInt();
    System.out.print("Enter col: ");
    int col = sc.nextInt();

    for (int i = 1; i<=row; i++){
        for (int j = 1; j<=col; j++){   //Main logic
            if ((i+j)%2==0) {           //Main logic bruh
                System.out.print(1);
            }
            else {
                System.out.print(2);
            }
        }
        System.out.println();
    }
}
}
